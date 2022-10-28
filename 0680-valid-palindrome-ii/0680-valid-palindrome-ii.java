class Solution {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return helper(s, left + 1, right) || helper(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean helper(String str, int start, int end) {
        int left = start;
        int right = end;
        
        while(left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}