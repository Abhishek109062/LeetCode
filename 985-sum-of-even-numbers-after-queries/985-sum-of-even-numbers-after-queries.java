class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(int x = 0; x < nums.length; x++)
            if(nums[x] % 2 == 0)
                sum += nums[x];
        
        int[] ans = new int[queries.length];
        for(int x = 0; x < queries.length; x++){
            int index = queries[x][1];
            if(nums[index] % 2 == 0)
                sum -= nums[index];
            
            nums[index] += queries[x][0];
            
            if(nums[index] % 2 == 0)
                sum += nums[index];
            
            ans[x] = sum;
        }
        
        return ans;
    }
}