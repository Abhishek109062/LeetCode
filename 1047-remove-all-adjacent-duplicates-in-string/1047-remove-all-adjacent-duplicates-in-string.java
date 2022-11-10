class Solution {
    public String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        for(int x = 0; x < s.length(); x++){
            ch[i] = ch[x];
            if(i > 0 && ch[i] == ch[i-1])
                i -= 2;
            
            i++;
        }
        
        return new String(ch, 0 , i);
    }
}