class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Set<String> temp = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        
        
        for(String x : words)
            temp.add(x);
        for(String x : words){
            if(find(x, temp, map))
                ans.add(x);
        }
        return ans;
    }
    
    
    public boolean find(String i, Set<String> temp, Map<String, Integer> map){
        if(map.containsKey(i))
            return map.get(i) == 1;
        
        for(int x = 0;x < i.length(); x++){
            if(temp.contains(i.substring(0,x))){
                String str = i.substring(x);
                
                if(temp.contains(str) || find(str, temp, map)){
                    map.put(i,1);
                    return true;
                }
            }
        }
        
        map.put(i, 0);
        return false;
    }
}