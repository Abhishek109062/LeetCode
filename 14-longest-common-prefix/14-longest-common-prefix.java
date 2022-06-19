class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        String temp=strs[0];
        String ans="";
        for(int x=0;x<temp.length();x++){
            char ch=temp.charAt(x);
            for(int y=1;y<strs.length;y++){
                if(x>=strs[y].length() || ch!=strs[y].charAt(x))
                    return ans;
            }
            ans=ans+temp.charAt(x);
        }
        return ans;
    }
}