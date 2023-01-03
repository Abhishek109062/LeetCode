class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int mulsum = 0;
        
        for(int x = 0; x < nums.length; x++){
            sum += nums[x];
            mulsum += x*nums[x];
        }
        
        int result = mulsum;
        for(int x = nums.length-1; x >= 0; x--){
            mulsum = mulsum + sum - (nums.length)*nums[x];
            result = Math.max(result, mulsum);
        }
        return result;
    }
}