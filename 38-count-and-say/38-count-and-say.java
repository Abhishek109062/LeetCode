class Solution {
    
    public String countAndSay(int n) {
        String ans="1";    
            for(int x=1;x<n;x++){
                ans=find(ans);
            }
        return ans;
    }
    
    public String find(String s){
        String temp="";
        int count=1;
        char ch=s.charAt(0);
        for(int x=1;x<s.length();x++){
            if(s.charAt(x)==ch)
                count++;
            else{
                temp+=count;
                temp+=ch;
                count=1;
                ch=s.charAt(x);
            }
        }
            temp+=count;
            temp+=ch;
        
        
        return temp;
    }
    
}