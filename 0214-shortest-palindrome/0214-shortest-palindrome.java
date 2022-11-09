class Solution {
    public String shortestPalindrome(String s) {
        int ind = 0;
        for(int x = s.length() - 1; x >= 0; x--)
            if(s.charAt(x) == s.charAt(ind))
                ind++;
        
        if(ind == s.length())
            return s;
        
        String temp = s.substring(ind);
        String rev = "";
        for(int x = 0; x < temp.length(); x++)
            rev = temp.charAt(x) + rev;
        
        return rev + shortestPalindrome(s.substring(0, ind)) + temp;
        
    }
}