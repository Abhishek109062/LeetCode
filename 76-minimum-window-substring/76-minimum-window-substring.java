class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> ans = new HashMap<>();
        for(int x = 0; x < t.length(); x++)
            ans.put(t.charAt(x),ans.getOrDefault(t.charAt(x),0)+1);
            
        int left = 0;
        int minleft = 0;
        int count = 0;
        int result = s.length()+1;
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(ans.containsKey(ch)){
                ans.put(ch,ans.get(ch)-1);
                if(ans.get(ch) >= 0)
                count++;
            }
            
            while(count == t.length()){
                if(right - left + 1 < result){
                    minleft  = left;
                    result = right - left +1;
                }
                
                char ch1 = s.charAt(left);
                if(ans.containsKey(ch1)){
                    ans.put(ch1,ans.get(ch1)+1);
                    if(ans.get(ch1) > 0)
                        count--;
                }
                left++;
                
            }
        }
        
        if(result > s.length())
            return "";
        
        return s.substring(minleft,minleft+result);
        
    }
}