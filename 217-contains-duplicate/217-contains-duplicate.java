class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int x=0;x<nums.length-1;x++){
            if(nums[x]==nums[x+1])
                return true;
        }
        return false;
    }
}