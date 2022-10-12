class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int x = nums.length - 1; x >= 2; x--){
            if(nums[x] < nums[x-1] + nums[x-2])
                return nums[x] + nums[x-1] + nums[x-2];
        }
        
        return 0;
    }
}