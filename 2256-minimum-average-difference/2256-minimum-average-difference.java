class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long left[] = new long[n];
        long right[] = new long[n];
        long sum = 0;
        for(int x = 0; x < n; x++){
            sum += nums[x];
            left[x] = sum;
        }
        
        for(int x = n-1; x >= 0; x--){
            right[x] = sum - left[x];
        }
        
        int res = 0;
        long min = Integer.MAX_VALUE;
        
        // for(int x = 0; x < n; x++)
        //     System.out.println(left[x] + " " + right[x]);
        
        for(int x = 0; x < n; x++){
            long diff = Math.abs(left[x]/(x+1) - (x == n - 1 ? 0 : right[x]/( n - x - 1)));
            
            if(diff < min){
                min = diff;
                res = x;
            }
        }
        
        return res;
    }
}