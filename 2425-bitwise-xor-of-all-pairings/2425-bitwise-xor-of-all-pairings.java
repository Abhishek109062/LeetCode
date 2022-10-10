class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;
        
        for(int x = 0; x < nums1.length; x++)
            xor1 ^= nums1[x];
        
        for(int x = 0; x < nums2.length; x++)
            xor2 ^= nums2[x];
        
        int result = (nums1.length % 2 * xor2) ^ (nums2.length % 2 * xor1);
        
        return result;
    }
}