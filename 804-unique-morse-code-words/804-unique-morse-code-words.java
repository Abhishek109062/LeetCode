class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> temp2=new HashSet<>();
        for(String temp:words){
            int len=temp.length()-1;
            String ans="";
            while(len>=0){
                ans=s[temp.charAt(len)-97]+ans;
                len--;
            }
            temp2.add(ans);
        }
        return temp2.size();
    }
}