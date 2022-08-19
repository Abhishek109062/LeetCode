class Solution {
    public int removeDuplicates(int[] nums) {
    int count=0;
        for(int x:nums){
            if(count<2 || x>nums[count-2])
                nums[count++]=x;
        }
        return count;
    }
}