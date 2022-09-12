class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int x = 0; x < n;x++){
            if(nums[x] > n || nums[x] <= 0)
                nums[x] = n+1;
        }
        
        for(int x = 0; x < n;x++){
            int temp = Math.abs(nums[x]);
            
            if(temp > n)
                continue;
            
            temp--;
            
            if(nums[temp] > 0)
                nums[temp] = -1*nums[temp];
        }
        
        for(int x = 0; x < n ; x++){
            if( nums[x] >= 0)
                return x+1;
        }
        return n+1;
    }
}