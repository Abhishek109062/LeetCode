class Solution {
    public boolean canJump(int[] nums) {
        int c=0;
        for(int x=0;x<nums.length;x++){
            if(x>c)
                return false;
            c=Math.max(c,x+nums[x]);
        }
        return true;
    }
}