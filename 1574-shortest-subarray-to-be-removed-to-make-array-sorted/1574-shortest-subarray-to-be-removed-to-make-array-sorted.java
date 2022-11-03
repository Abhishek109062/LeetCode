class Solution {
    public int findLengthOfShortestSubarray(int[] nums) {
        int left = 0;
        int len = nums.length;
        while(left < len -1 && nums[left] <= nums[left + 1])
            left++;
        
        if(left == len -1)
            return 0;
        
        int right = len -1;
        
        while(right >= left && nums[right -1] <= nums[right])
            right--;
        
        if(right == 0)
            return len - 1;
        
        
        int ans = Math.min(len - left -1, right);
        int x = 0;
        int y = right;
        while(x <= left && y < len){
            if(nums[y] >= nums[x]){
                ans = Math.min(ans, y - x - 1);
                x++;
            }
            else
                y++;
        }
        
        return ans;
    }
}