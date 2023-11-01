class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        for(int x = 0; x <= end; x++){
            if(nums[x] == 0){
                int temp = nums[x];
                nums[x] = nums[start];
                nums[start] = 0;
                start++;
            }
            
            if(nums[x] == 2){
                int temp = nums[x];
                nums[x] = nums[end];
                nums[end] = 2;
                end--;
                x--;
            }
        }
    }
}