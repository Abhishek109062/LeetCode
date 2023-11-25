class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int len = nums.length;
        
        int[] prefix = new int[len];
        int[] suffix = new int[len];
        prefix[0] = nums[0];
        suffix[len - 1] = nums[len - 1]; 
        int[] ans = new int[len];
        for(int x = 1; x < nums.length; x++){
            prefix[x] += prefix[x-1] + nums[x];
        }
        for(int x = len - 2; x >= 0; x--){
            suffix[x] += suffix[x+1] + nums[x];
        }
        
        for(int x = 0; x < len; x++){
            ans[x] = nums[x]*x - prefix[x] + suffix[x] - nums[x]*(len - 1 - x);
        }
        
        return ans;
    }
}