class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        if (len2 > len1) {
            return findLength(nums2, nums1);
        }
        
        int min = Math.min(len1, len2);
        
        int left = 0;
        int right = min + 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (check(mid, nums1, nums2)) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if (left == 0) {
            return 0;
        }
        return left - 1;
    }
    
    private boolean check(int len, int[]nums1, int[]nums2) {
        if (len == 0) {
            return false;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        long[] power = new long[len1];
        power[0] = 1;
        int prime = 101;
        int mod = 1000000007;
        for (int i = 1; i < len1; ++i) {
            power[i] = (power[i - 1] * prime) ;
        }
        
        Set<Long> set = new HashSet<>();
        long hash1 = 0;
        for (int i = 0; i < len; ++i) {
            hash1 = (hash1 * prime + nums2[i] + 1) ;
        }
        set.add(hash1);
        
        for (int i = 0; i <= len2 - len - 1; ++i) {
            int num = nums2[i] + 1;
            int num2 = nums2[i + len] + 1;
            hash1 = (hash1 - (power[len - 1] * num) ) ;
            hash1 = (hash1 * prime + num2) ;
            set.add(hash1);
        }
        long hash2 = 0;
        for (int i = 0; i < len; ++i) {
            hash2 = (hash2 * prime + nums1[i] + 1) ;
        }
        if (set.contains(hash2)) {
            return true;
        }
        for (int i = 0; i <= len1 - len - 1; ++i) {
            int num = nums1[i] + 1;
            int num2 = nums1[i + len] + 1;
            hash2 = (hash2 - (power[len - 1] * num) ) ;
            hash2 = (hash2 * prime + num2);
            if (set.contains(hash2)) {
                return true;
            }
        }
        return false;
    }
}