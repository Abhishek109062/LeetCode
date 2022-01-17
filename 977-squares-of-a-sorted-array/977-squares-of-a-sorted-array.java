class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int x=0;x<nums.length;x++)
        {
            nums[x]*=nums[x];
        }
        Arrays.sort(nums);
        return nums;
    }
}