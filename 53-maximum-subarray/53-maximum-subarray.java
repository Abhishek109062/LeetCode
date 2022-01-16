class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int sum2=nums[0];
        
        for(int x=1;x<nums.length;x++)
        {
            if(sum<0)
                sum=0;
            
            sum+=nums[x];
            if(sum>sum2)
                sum2=sum;
        }
        return sum2;
    }
}