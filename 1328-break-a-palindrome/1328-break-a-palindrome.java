class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len == 1)
            return "";
        
        char ch[] = palindrome.toCharArray();
        for(int x = 0; x < len/2; x++){
            if(ch[x] != 'a'){
                ch[x] = 'a';
                return String.valueOf(ch);
            }
        }
        ch[len - 1] = 'b';
        return String.valueOf(ch);
        
    }
}