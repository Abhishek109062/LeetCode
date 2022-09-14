class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i = 0;
        int j = 0;
        long p = 1L;
        int n = nums.length;
        int total = 0;
        
        while(j < n){
            p *= nums[j];
            
            while(i <= j && p >= k)
            {
                p/=nums[i];
                i++;
            }
            
            total += (j - i + 1) ;
            j++;
        }
        return total;
    }
}