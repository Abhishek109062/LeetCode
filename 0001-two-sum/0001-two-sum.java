class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for(int x = 0; x < nums.length - 1; x++){
            if(nums[x] + nums[x+1] == target){
                ans[0] = x;
                ans[1] = x+1;
                return ans;
            }
        }
        
        
        for(int x = 0; x < nums.length; x++){
            for(int y = x+2; y < nums.length; y++){
                if(nums[x] + nums[y] == target){
                    ans[0] = x;
                    ans[1] = y;
                    return ans;
                }
            }
        }
        
        return new int[]{0,1};
    }
}