class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        
        for(int temp : nums)
            sum += temp;
        
        int maxlen = -1;
        int tempsum = 0;
        
        for(int i = 0, j = 0; j < nums.length; j++){
            tempsum += nums[j];
            
            while(i <= j && tempsum > sum - x){
                tempsum -=nums[i++];
            }
            
            if(tempsum == sum - x)
                maxlen = Math.max(maxlen, j - i + 1);
        }
        return maxlen == -1 ? -1 : nums.length - maxlen;
    }
}