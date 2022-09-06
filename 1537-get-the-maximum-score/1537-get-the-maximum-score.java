class Solution {
    public int maxSum(int[] num1, int[] num2) {
       int len1 = num1.length;
       int len2 = num2.length;
        long mod=1000000007;
        int i = 0 ,j = 0 ;
        long total1 = 0L ,total2 = 0L ,ans = 0L;
        
        while(i < len1 && j < len2){
            if(num1[i] < num2[j])
                total1 =(total1 + num1[i++]);
            
            else if(num1[i] > num2[j])
                total2 = (total2 + num2[j++]);

            else{
                ans = (ans+ Math.max(total1,total2));
                total1=0;
                total2=0;
                
                while(i<len1 && j<len2 && num1[i]==num2[j]){
                    ans = (ans + num1[i]);
                    i++;
                    j++;
                }
            }
        }
        
        while(i<len1)
            total1 = (total1 + num1[i++]);
        
        while(j<len2)
            total2 = (total2 + num2[j++]);
        
        ans = (ans+Math.max(total1,total2));
        return (int)(ans%mod);
    }
}

// public int maxSum(int[] A, int[] B) {
//         int i = 0, j = 0, n = A.length, m = B.length;
//         long a = 0, b = 0, mod = (long)1e9 + 7;
//         while (i < n || j < m) {
//             if (i < n && (j == m || A[i] < B[j])) {
//                 a += A[i++];
//             } else if (j < m && (i == n || A[i] > B[j])) {
//                 b += B[j++];
//             } else {
//                 a = b = Math.max(a, b) + A[i];
//                 i++; j++;
//             }
//         }
//         return (int)(Math.max(a, b) % mod);
//     }