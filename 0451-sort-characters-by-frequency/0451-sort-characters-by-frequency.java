class Solution {
    public String frequencySort(String s) {
         Map<Character, Integer> temp = new HashMap<>();
        
        for(int x = 0; x < s.length(); x++){
            temp.put(s.charAt(x), temp.getOrDefault(s.charAt(x), 0) + 1);
        }
        
        List<Character>[] ans = new List[s.length() + 1];
        
        for(char ch : temp.keySet()){
            int freq = temp.get(ch);
            
            if(ans[freq] == null)
                ans[freq] = new ArrayList<>();
            
            ans[freq].add(ch);
        }
        
        int len = s.length();
        s = "";
        for(int x = len; x >= 0; x--){
            if(ans[x] == null)
                continue;
            
            for(char ch: ans[x]){
                int temp2 = x;
                while(temp2-- > 0)
                    s = s + ch;
            }
        }
        // System.out.println(ans);?
        return s;
    }
}