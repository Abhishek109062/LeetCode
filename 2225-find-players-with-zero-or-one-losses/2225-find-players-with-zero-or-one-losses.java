class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();
        
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        
        TreeMap<Integer, Integer> map1 = new TreeMap<>();
        
        for(int x = 0; x < matches.length; x++){
            if(map1.containsKey(matches[x][0])){
                if(map1.get(matches[x][0]) > 0)
                    map1.put(matches[x][0], map1.get(matches[x][0]) + 1);
                    
            }
            else{
                map1.put(matches[x][0], 1);
            }
            
            if(map1.containsKey(matches[x][1])){
                if(map1.get(matches[x][1]) > 0)
                    map1.put(matches[x][1], -1);
                else
                    map1.put(matches[x][1], map1.get(matches[x][1]) - 1);
            }
            else{
                map1.put(matches[x][1], -1);
            }
            
        }
        
        for(int x: map1.keySet()){
            if(map1.get(x) > 0)
                ans.get(0).add(x);
            else if(map1.get(x) == -1)
                ans.get(1).add(x);
        }
        
        return ans;
    }
}