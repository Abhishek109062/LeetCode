class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length() < 10)
            return new ArrayList<>();
        HashMap<String,Integer> ans = new HashMap<>();
        
        for(int x = 9; x < s.length() ; x++){
            String temp = s.substring(x-9,x+1);
            ans.put(temp,ans.getOrDefault(temp,0)+1);
        }
        List<String> result = new ArrayList<>();
        for(String str : ans.keySet()){
            if(ans.get(str)>1)
                result.add(str);
        }
        
        return result;
    }
}