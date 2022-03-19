class Solution {
    public int jump(int[] nums) {
        int count=0,curfur=0,curend=0;
        for(int x=0;x<nums.length-1;x++){
            curfur=Math.max(curfur,x+nums[x]);
            if(x==curend)
            {
                count++;
                curend=curfur;
                if(curend>=nums.length-1)
                    break;
            }
        }
        
        return count;
    }
}