class Solution {
    public int maximum69Number (int num) {
        String s = "" + num;
        // String ans;
        for(int x = 0; x < s.length(); x++){
            if(s.charAt(x) == '6'){
                if(x == s.length() - 1)
                    return Integer.parseInt(s.substring(0, x) + "9");
                else
                    return Integer.parseInt(s.substring(0, x) + "9" + s.substring(x+1));
            }
        }
        
        return num;
    }
}