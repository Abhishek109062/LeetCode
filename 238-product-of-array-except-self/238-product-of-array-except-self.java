class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        for(int x=0;x<nums.length;x++){
            if(nums[x]==0){
                count++;
            }
            else
            product*=nums[x];
        }
        int[] ans=new int[nums.length];
        if(count==nums.length)
        for(int x=0;x<nums.length;x++){
            ans[x]=0;
        }
        else
            for(int x=0;x<nums.length;x++){
                if(count>1)
                    ans[x]=0;
                else if(count==1 && nums[x]!=0)
                    ans[x]=0;
                else if(count==1 && nums[x]==0)
                    ans[x]=product;
                else
                    ans[x]=product/nums[x];
            }
        
        return ans;
    }
}