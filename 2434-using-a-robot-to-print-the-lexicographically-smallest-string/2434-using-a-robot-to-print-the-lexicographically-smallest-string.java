class Solution {
    public String robotWithString(String s) {
        if(s.length() == 0)
            return "";
        
        int[] count = new int[26];
        for(char ch: s.toCharArray())
            count[ch - 'a']++;
        
        StringBuilder ans = new StringBuilder();
        Stack<Character> temp = new Stack<>();
        for(char ch: s.toCharArray()){
            temp.push(ch);
            count[ch - 'a']--;
            
            while(!temp.isEmpty()){
                char chr = temp.peek();
                if(smaller(chr, count))
                    break;
                ans.append(temp.pop());
            }
        }
        
        return ans.toString();
    }
    
    public boolean smaller(char ch, int[] count){
        int ind = ch - 'a';
        for(int x = 0; x < ind; x++)
            if(count[x] > 0)
                return true;
        
        return false;
    }
}