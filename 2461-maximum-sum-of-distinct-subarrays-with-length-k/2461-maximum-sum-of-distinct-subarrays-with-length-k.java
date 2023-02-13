class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int len = nums.length;
        
        long maxsum = 0;
        long cursum = 0;
        int windowsize = 0;
        int j = 0;
        Map<Integer, Integer> temp = new HashMap<>();
        for(int x = 0; x < len; x++){
            cursum += nums[x];
            temp.put(nums[x], temp.getOrDefault(nums[x], 0) + 1);
            windowsize++;
            while(temp.get(nums[x]) > 1 || windowsize > k){
                temp.put(nums[j], temp.get(nums[j]) - 1);
                cursum -= nums[j++];
                windowsize--;
            }
            
            if(windowsize == k)
                maxsum = maxsum > cursum ? maxsum : cursum;
            
        }
        
        return maxsum;
    }
}