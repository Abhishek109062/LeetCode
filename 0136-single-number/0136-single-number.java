class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int x = 0; x < nums.length; x++)
            ans = ans ^ nums[x];
        
        return ans;
    }
}