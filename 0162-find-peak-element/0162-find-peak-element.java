class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        
        if(nums.length==2)
            return (nums[0]>nums[1]?0:1);
        
        if(nums.length>=2 && nums[0]>nums[1])
            return 0;
            
        
        if(nums.length>=2 && nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;
        
        for(int x=1;x<nums.length-1;x++)
        {
            if(nums[x-1]<nums[x] && nums[x+1]<nums[x])
                return x;
        }
        
        return -1;
    }
}