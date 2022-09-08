class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        
        s=s.replaceAll(" +"," ");
        StringBuilder ans=new StringBuilder();
        String ar[]=s.split(" ");
        
        
        for(int x=ar.length-1;x>=1;x--)
            ans.append(ar[x]+" ");
            
        
        ans.append(ar[0]);
        return ans.toString();
    }
}