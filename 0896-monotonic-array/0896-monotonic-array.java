class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean temp1 = true;
        boolean temp2 = true;
        for(int x = 0; x < nums.length - 1; x++){
            if(nums[x] <= nums[x+1]);
            else{
                temp1 = false;
                break;
            }
        }
        
        
        for(int x = 0; x < nums.length - 1; x++){
            if(nums[x] >= nums[x+1]);
             else{
                temp2 = false;
                break;
            }
        }
        
        return temp1 || temp2;
    }
}