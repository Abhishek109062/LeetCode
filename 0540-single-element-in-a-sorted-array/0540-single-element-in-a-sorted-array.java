class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Set<Integer> temp = new HashSet<>();
        int xor = 0;
        for(int x : nums)
            xor = xor^x;
        
        return xor;
        
    }
}