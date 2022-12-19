class Solution {
    public int nextGreaterElement(int n) {
        char ch[] = ("" + n).toCharArray();
        int i = ch.length - 2;
        while(i >= 0 && ch[i] >= ch[i+1])
            i--;
        
        if(i == -1)
            return -1;
        
        int j = ch.length - 1;
        
        while(j > i && ch[j] <= ch[i])
            j--;
        swap(ch, i , j);
        // System.out.println(ch);
        
        long ans = 0;
        for(int x = 0; x <= i; x++){
            ans = ans*10 + (ch[x] - '0');
        }
        
        for(int x = ch.length -1; x > i; x--){
            ans = ans*10 + (ch[x] - '0');
            // System.out.println(ans);
        }
        
        if(ans > Integer.MAX_VALUE)
            return -1;
        
        return (int)ans;
        
    }
    
    public void swap(char[] arr, int i, int j){
        char temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}