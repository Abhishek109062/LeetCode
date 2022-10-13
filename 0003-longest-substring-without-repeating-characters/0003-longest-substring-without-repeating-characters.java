class Solution {
   public int lengthOfLongestSubstring(String s) {
        
        int l = 0, r = 0, longest = 0;
        int[] chars = new int[95];
        int offset = 32;
        if(s.length()==1)
            return 1;

        while (r < s.length()) {
            char c = s.charAt(r);
            l = Math.max(chars[c - offset], l); 
            longest = Math.max(longest, r - l + 1);
            
            chars[c - offset] = r +1;
            r++;
        }

        return longest;
    }
}