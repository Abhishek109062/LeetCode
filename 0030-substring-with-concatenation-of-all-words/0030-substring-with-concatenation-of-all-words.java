class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int wordlen = words[0].length();
        int len = words.length;
        for(int x = 0; x < len; x++)
            map.put(words[x], map.getOrDefault(words[x], 0) + 1);
        
        for(int x = 0; x <= s.length() - wordlen * len ; x++){
            Map<String, Integer> came = new HashMap<>();
            int j = 0;
            
            while(j < len){
                String temp = s.substring(x + j*wordlen, x + (j+1)*wordlen);
                if(map.containsKey(temp)){
                    came.put(temp, came.getOrDefault(temp, 0) + 1);
                    if(came.get(temp) > map.getOrDefault(temp, 0))
                        break;
                }
                else
                    break;
                j++;
                
            }
            if(j == len)
                    ans.add(x);
        }
        
        return ans;
    }
}