class Solution {
    public int search(int[] nums, int target) {
        int length=nums.length;
        
        if(nums[length/2]>target)
        {
            for(int x=0;x<=length/2;x++)
            {
                if(nums[x]==target)
                    return x;
            }
        }
        else
        {
            for(int x=length/2;x<length;x++)
            {
                if(nums[x]==target)
                    return x;
            }
        }
           return -1;
    }
}
