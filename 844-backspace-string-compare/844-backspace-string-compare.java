class Solution {
    public boolean backspaceCompare(String s, String t) {
        int slen=s.length()-1,tlen=t.length()-1, count;
        while(true){
            count=0;
        while(slen>=0 && (count>0 || s.charAt(slen)=='#')){
            count+=s.charAt(slen)=='#'?1:-1;
            slen--;
        }
        
        count=0;
        while(tlen>=0 && (count>0 || t.charAt(tlen)=='#')){
            count+=t.charAt(tlen)=='#'?1:-1;
            tlen--;
        }
        
        if(slen>=0 && tlen>=0 && s.charAt(slen)==t.charAt(tlen)){
            tlen--;
            slen--;
        }
            else
                break;
        }
        
        return slen==-1 && tlen==-1;
    }
}