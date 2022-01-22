class Solution {
    public String reverseWords(String s) {
        
       char [] chars = s.toCharArray();
       helper(chars, 0);
       return String.valueOf(chars);
    }
    
    void helper(char[] chars, int i) {
        int l = i;
        while(i < chars.length && chars[i] != ' ') i++;
        int r = i - 1;
        
        while(l < r) {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;r--;
        }
        
        if(i < chars.length) helper(chars, i + 1);
    }
}