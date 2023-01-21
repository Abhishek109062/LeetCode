class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int x = 0; x < nums.length; x++){
            if(nums[x] > nums[(x+1) % nums.length])
                count++;
        }
        return count <= 1;
        
    }
}