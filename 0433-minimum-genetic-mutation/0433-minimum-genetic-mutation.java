class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(start.length() < 8 || end.length() < 8 || bank.length < 1)
            return -1;
        
        HashSet<String> map = new HashSet<>();
        char replace[] = {'A', 'C', 'G', 'T'};
        for(String x : bank)
            map.add(x);
        
        Queue<String> temp = new LinkedList<>();
        temp.add(start);
        int level = 0;
        
        while(true){
            int si = temp.size();
            level++;
            if(si < 1)
                return -1;
            
            for(int x = 0; x < si; x++){
                char ch[] = temp.poll().toCharArray();
                
                for(int y = 0; y < 8; y++){
                    char change = ch[y];
                    
                    for(int z = 0; z < 4; z++){
                        ch[y] = replace[z];
                        
                        if(String.valueOf(ch).equals(end) && map.contains(String.valueOf(ch)))
                            return level;
                        
                        if(!map.contains(String.valueOf(ch)))
                            continue;
                        
                        map.remove(String.valueOf(ch));
                        temp.add(String.valueOf(ch));
                    }
                    
                    ch[y] = change;
                }
            }
        }
    }
}