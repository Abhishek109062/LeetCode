class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        
        int count[] = new int[26];
        for(int x = 0; x < s1.length(); x++){
            count[s1.charAt(x) - 'a']++;
            count[s2.charAt(x) - 'a']--;
        }
        
        if(possible(count))
            return true;
        
        for(int x = s1.length(); x < s2.length(); x++){
            count[s2.charAt(x) - 'a']--;
            count[s2.charAt(x-s1.length()) - 'a']++;
            if(possible(count))
                return true;
        }
        return false;
    }
    
    public boolean possible(int[] count){
        for(int x = 0; x < 26; x++)
            if(count[x] != 0)
                return false;
        
        return true;
    }
}