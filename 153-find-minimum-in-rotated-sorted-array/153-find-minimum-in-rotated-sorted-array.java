class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums[0]<nums[nums.length-1])
            return nums[0];
        
        for(int x=0;x<nums.length;x++){
            if(nums[x]>nums[x+1])
                return nums[x+1]; 
        }
        
        return nums[0];
    }
}