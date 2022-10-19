class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        boolean[] bool = new boolean[1001];

        int[] res = new int[Math.max(nums1.length, nums2.length)];

        for (int i : nums1) bool[i] = true;

        int c = 0;
        for (int i : nums2) {
            if (bool[i] == true) {
                res[c++] = i;
                bool[i] = false;
            }
        }
        return Arrays.copyOf(res, c);
    }
}