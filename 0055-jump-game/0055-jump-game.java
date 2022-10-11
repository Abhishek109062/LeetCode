class Solution {
    public boolean canJump(int[] nums) {
        int ans = nums.length - 1;
        
        for(int x = nums.length-1; x >=0; x--){
            if(x + nums[x] >= ans)
                ans = x;
        }
        return ans == 0;
    }
}