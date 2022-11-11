class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        // int i = 1;
        for(int x = 0; x < nums.length - 1; x++){
            if(nums[x] != nums[x+1]){
                nums[count++] = nums[x+1];
            }
        }
        
        return count;
    }
}