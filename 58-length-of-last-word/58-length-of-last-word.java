class Solution {
    public int lengthOfLastWord(String s) {
        int z=0;
        s=s.trim();
        int l=s.length()-1;
        
        while(l>-1 && s.charAt(l)!=' ')
        {
            z++;
            l--;
            
        }
        return z;
    }
}