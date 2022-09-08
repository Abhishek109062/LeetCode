class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        
        s=s.replaceAll(" +"," ");
        String ans="";
        String ar[]=s.split(" ");
        s="";
        for(int x=ar.length-1;x>=0;x--)
            s+=ar[x]+" ";
        
        return s.substring(0,s.length()-1);
    }
}