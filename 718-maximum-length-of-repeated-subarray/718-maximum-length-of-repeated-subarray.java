class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
            return 0;
        
        int dp[][] = new int[nums1.length+1][nums2.length+1];
        int max = 0;
        for(int x = 0; x <= nums1.length; x++){
            for(int y = 0; y <= nums2.length; y++){
                if(x == 0 || y == 0)
                    dp[x][y] = 0;
                else{
                    if(nums1[x-1] == nums2[y-1]){
                    dp[x][y] = 1+ dp[x-1][y-1];
                    max  = Math.max(max,dp[x][y]);
                    }
                }
            }
        }
        return max;
    }
}