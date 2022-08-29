class Solution {
    public boolean judgeCircle(String moves) {
        int i=0,j=0;
        for(int x=0;x<moves.length();x++){
            char ch=moves.charAt(x);
            if(ch=='R')
                i++;
            else if(ch=='U')
                j++;
            else if(ch=='D')
                j--;
            else
                i--;
        }
        return (i==0 && j==0);
    }
}