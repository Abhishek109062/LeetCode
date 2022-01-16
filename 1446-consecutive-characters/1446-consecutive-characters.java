class Solution {
    public int maxPower(String s) {
       int c=1,cm=1;
        char c1=s.charAt(0);
        for(int x=1;x<s.length();x++)
        {
            if(s.charAt(x)==c1)
            {
                c++;
                if(c>cm)
                    cm=c;
            }
            else
            {
                c1=s.charAt(x);
                
                    c=1;
            }
        }
        return cm;
    }
}