class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans = new ArrayList<>();
        if(paths.length == 0)
            return ans;
        
        Map<String , Set<String>> temp = new HashMap<>();
        for(String part : paths){
            String temp1[] = part.split(" +");
            for(int x = 1; x < temp1.length; x++){
                int index = temp1[x].indexOf("(");
                String con = temp1[x].substring(index);
                String fileAdd = temp1[0] + "/" + temp1[x].substring(0,index);
                Set<String> filead = temp.getOrDefault(con,new HashSet<>());
                filead.add(fileAdd);
                temp.put(con,filead);
            }
        }
        for(String s:temp.keySet()){
            if(temp.get(s).size() > 1)
                ans.add(new ArrayList<>(temp.get(s)));
        }
        
        
        return ans;    
    }
}