class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
            return "";
        
        Map<Character , Integer> map = new HashMap<>();
        
        for(char ch : t.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        
        int count = 0;
        int left = 0;
        int minleft = 0;
        int minl = s.length() + 1;
        // String 
        for(int x = 0; x < s.length(); x++){
            char ch = s.charAt(x);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                
                if(map.get(ch) >= 0)
                    count++;
            }
            
            
            while(count == t.length()){
                if(x - left + 1 < minl){
                    minleft = left;
                    minl = x - left + 1;
                }
                if(map.containsKey(s.charAt(left))){
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                            
                    if(map.get(s.charAt(left)) > 0)
                        count--;
                }
                
                left++;
            }
        }
    
        if(minl == s.length() + 1)
            return "";
        
        return s.substring(minleft, minleft + minl);
    }
}