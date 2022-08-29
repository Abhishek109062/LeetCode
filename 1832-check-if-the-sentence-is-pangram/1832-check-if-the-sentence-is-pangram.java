class Solution {
    public boolean checkIfPangram(String sentence) {
        int ch[]=new int[26];
        for(int x=0;x<sentence.length();x++){
         
                ch[sentence.charAt(x)-'a']++;
        }
        for(int x=0;x<26;x++){
            if(ch[x]==0)
                return false;
        }
        return true;
        
    }
}