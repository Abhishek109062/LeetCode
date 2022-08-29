class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length() == 0) return true;
        int x = 0, y = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U') y+=1;
            else if(c == 'D') y-=1;
            else if(c == 'L') x-=1;
            else x+=1;
        }
        return (x == 0 && y == 0);
    }
}