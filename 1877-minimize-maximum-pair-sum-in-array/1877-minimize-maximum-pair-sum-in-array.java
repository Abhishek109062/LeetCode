class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for(int x = 0; x < len/2; x++){
            max = Math.max(max,  nums[x] + nums[len -1 - x]);
        }
        return max;
    }
}