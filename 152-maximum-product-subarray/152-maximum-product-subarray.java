class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,l=0,r=0,res=nums[0];
        for(int x=0;x<n;x++){
            l=(l==0?1:l)*nums[x];
            r=(r==0?1:r)*nums[n-1-x];
            res=Math.max(res,Math.max(l,r));
        }
        return res;
    }
}