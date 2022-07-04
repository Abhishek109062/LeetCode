class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=s.length();
        int len2=t.length();
        while(len>=1 && len2>=1){
            if(s.charAt(len-1)==t.charAt(len2-1))
                len--;
            
            len2--;
        }
        
        return len==0?true:false;
    }
}