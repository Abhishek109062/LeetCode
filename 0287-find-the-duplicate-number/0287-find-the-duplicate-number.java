class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;
        for(int x = 0; x < nums.length; x++){
            if(nums[x+1] == nums[x])
                return nums[x];
        }
        return -1;

    }
}