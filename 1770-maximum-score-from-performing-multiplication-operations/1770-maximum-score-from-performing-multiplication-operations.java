class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        int[] dp = new int[nums.length + 1];
        for (int m = multipliers.length - 1, delta = nums.length - multipliers.length; m >= 0; m--, delta++) {
            for (int i = 0; i < nums.length - delta; i++) {
                dp[i] = Math.max(dp[i] + multipliers[m] * nums[i + delta], dp[i + 1] + multipliers[m] * nums[i]);
            }
        }
        return dp[0];
    }
}