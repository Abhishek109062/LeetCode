class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0;
        int sum = 0, result = Integer.MAX_VALUE;
        while(i < nums.length){
            while(sum <target && i < nums.length)
                sum += nums[i++];
            
            if(sum >= target){
            while(sum >= target && j < i)
                sum -= nums[j++];
            result = Math.min(result,i-j+1);
            }
        }
        if(result == Integer.MAX_VALUE)
            return 0;
        else
            return result;
    }
}