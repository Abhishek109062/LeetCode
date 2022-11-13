class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String ans = "";
        String temp = "";
        s = s + " ";
        for(int x = 0; x < s.length(); x++){
        if(s.charAt(x) == ' ' && !temp.equals("")){
                ans = temp +" "+ ans;
                temp = "";
            }
        else if(s.charAt(x) != ' ')
                temp = temp + s.charAt(x);
        }
        
        return ans.substring(0, ans.length() - 1);
    }
}