class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> hash = new HashSet<>();
        for(int x = 0; x < nums.length; x++){
            if( x > k)
                hash.remove(nums[x - k - 1]);
            if(!hash.add(nums[x]))
                return true;
        }
        return false;
    }
}