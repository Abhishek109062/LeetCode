class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int x = 0;
        int y = 0;
        int sum = 0;
        int ans = nums.length + 1;
        while(sum <= target  && x < nums.length){
            sum += nums[x++];
            
            if(sum >= target){
            while(sum >= target && y < x)
                sum -= nums[y++];
                
                ans = Math.min(ans, x - y + 1);
            }
        }
        
        if(ans == nums.length + 1)
            return 0;
        
        return ans;
    }
}