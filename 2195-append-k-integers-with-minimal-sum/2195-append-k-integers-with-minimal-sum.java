class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
       long reduceSum = 0;
        
        for(int x = 0; x < nums.length; x++){
            if((x==0 || !(nums[x-1] == nums[x])) && nums[x] <= k){
                k++;
                reduceSum += nums[x];
            }
        }
        
        return (long)k*(k+1)/2 - reduceSum;
    }
}