class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        
        boolean numSeen = false;
        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numAfterE = true;
        
        for(int x = 0; x < s.length(); x++){
            if(s.charAt(x) == '-' || s.charAt(x) == '+'){
                if(x != 0 && s.charAt(x-1) != 'e')
                    return false;
            }
            else if(s.charAt(x) <= '9' && s.charAt(x) >= '0'){
                numSeen = true;
                numAfterE = true;
            }
            else if(s.charAt(x) == '.'){
                if(eSeen || pointSeen)
                    return false;
                pointSeen = true;
            }
            else if(s.charAt(x) == 'e' || s.charAt(x) == 'E'){
                if(eSeen || !numSeen)
                    return false;
                eSeen = true;
                numAfterE = false;
            }
            else
                return false;
        }
        
        return numSeen && numAfterE;
    }
}