class Solution {
    public String longestCommonPrefix(String[] strs) {
    if(strs.length == 0){
        return "";
    }   
    else if(strs.length == 1){
        return strs[0];
}
    StringBuilder sb = new StringBuilder();
    String s = strs[0];
    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i);
        for(int j = 1; j<strs.length; j++ ){
            if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                return sb.toString();
            }
        }
    sb.append(ch);
    }
    
    return sb.toString();
    }
}