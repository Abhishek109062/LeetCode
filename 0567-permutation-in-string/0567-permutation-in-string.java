class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())
            return false;
        
        int count[] = new int[26];
        char ch[] = s2.toCharArray();
        for(char c : s1.toCharArray())
            count[c - 'a']++;
        
        
        int right = 0;
        int left = 0;
        int len = s1.length();
        int window = s1.length();
        while(right < s2.length()){
            if(count[ ch[right++] - 'a']-- > 0)
                window--;
            
            while(window == 0){
                if(right - left == len)
                    return true;
                
                if(count[ ch[left++] - 'a']++ == 0)
                    window++;
            }
        }
        return false;
    }
}