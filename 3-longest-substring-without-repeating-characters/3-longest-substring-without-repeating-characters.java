class Solution {
   public int lengthOfLongestSubstring(String input) {
        if (input == null || input.length() == 0) {
          return 0;
        }
        int globalMax = 0;
        int s = 0, f = 0;
        int[] count = new int[128];
        while (f < input.length()) {
          char c = input.charAt(f++);
          count[c]++;
          while (count[c] > 1) {
            count[input.charAt(s++)]--;
          }
          globalMax = Math.max(globalMax, f-s);
        }
        return globalMax;
    }
}