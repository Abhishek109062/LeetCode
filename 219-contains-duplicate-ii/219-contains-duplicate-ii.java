class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        for(int x = 0; x < nums.length; x++){
            for(int y = x+1; y <= x+k && y < nums.length; y++){
                if(nums[x] == nums[y])
                    return true;
            }
        }
        
        return false;
    }
}