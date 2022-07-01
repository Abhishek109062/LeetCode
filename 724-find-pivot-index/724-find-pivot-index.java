class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int x=0;x<nums.length;x++)
            sum+=nums[x];
        int sum2=0;
        for(int x=0;x<nums.length;sum2+=nums[x++]){
            if(sum2*2==sum-nums[x])
                return x;
        }
        return -1;
    }
}