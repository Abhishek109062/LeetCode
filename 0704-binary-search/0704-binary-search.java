class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length - 1;
        int low = 0;
        
        
        int ans = -1;
        while(low <= high){
            int mid = (high + low)/2;
            if(nums[mid] == target)
                return mid;
            
            if(nums[mid] < target)
                low = mid+1;
            else
                high = mid - 1;
        }
        return ans;
    }
}