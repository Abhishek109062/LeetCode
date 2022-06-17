class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int ar[]=new int[26];
        for(int x=0;x<s.length();x++)
            ar[s.charAt(x)-'a']++;
        for(int x=0;x<s.length();x++)
            ar[t.charAt(x)-'a']--;
        for(int x=0;x<26;x++)
            if(ar[x]!=0)
                return false;
        
        return true;
    }
}