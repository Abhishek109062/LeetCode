class Solution {
    public int findMin(int[] nums) {
        
        int l=0;
        int h=nums.length-1;
        
        if(nums[l]<=nums[h])
            return nums[0];
        while(l<=h)
        {
            int m=(l+h)/2;
            if(nums[m]>nums[m+1])
                return nums[m+1];
            else if (nums[m-1]>nums[m])
                return nums[m];
            else if(nums[l]<=nums[m])
                l=m+1;
            else
                h=m-1;
        }
        return -1;
        
    }
}