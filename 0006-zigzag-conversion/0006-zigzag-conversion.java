class Solution {
    public String convert(String s, int rows) {
        if(rows <= 1 || rows > s.length())
            return s;
    
        char ch[] = s.toCharArray();
        List<Character>[] ans = new ArrayList[rows];
        // String ans = "";
        
        for(int x = 0;x < rows; x++)
            ans[x] = new ArrayList<Character>();
        int i = 0;
        while(i < s.length()){
            
            for(int x = 0; x < rows && i < ch.length; x++)
                ans[x].add(ch[i++]);
            for(int x = rows - 2; x >= 1 && i < ch.length; x--)
                ans[x].add(ch[i++]);
            
        }
        
        String temp = "";
        for(List<Character> x : ans)
            for(char t : x)
            temp += "" + t;
        return temp;
    }
}