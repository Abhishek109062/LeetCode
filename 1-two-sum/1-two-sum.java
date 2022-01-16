class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n[]={-1,-1};
        for(int x=0;x<nums.length-1;x++)
        {
            int z=target-nums[x];
            for(int y=x+1;y<nums.length;y++)
            {
                if(z==nums[y])
                {
                    n[0]=x;
                    n[1]=y;
                    break;
                }
            }
            if(n[0]!=-1)
                break;
        }
        
        return n;
    }
}