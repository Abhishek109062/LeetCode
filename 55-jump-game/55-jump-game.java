class Solution {
    public boolean canJump(int[] nums) {
        int last=nums.length-1;
        for(int x=nums.length-1;x>=0;x--){
            if(x+nums[x]>=last)
                last=x;
        }
        return last<=0;
    }
}