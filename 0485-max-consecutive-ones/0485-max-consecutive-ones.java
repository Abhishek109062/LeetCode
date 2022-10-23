class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        
        for(int x : nums){
            if(x == 1)
                count++;
            else{
                max = max > count ? max : count;
                count = 0;
            }
        }
        
        
        return max < count ? count : max;
    }
}