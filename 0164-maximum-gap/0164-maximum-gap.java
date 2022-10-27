class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2)
            return 0;
        
        Arrays.sort(nums);
        
        int ans = 0;
        for(int x = nums.length - 1; x > 0; x--)
            ans = Math.max(ans, (nums[x] - nums[x-1]));
        
        return ans;
    }
}