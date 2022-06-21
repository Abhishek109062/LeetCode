class Solution {
    public boolean exist(char[][] board, String word) {
        char[] ch=word.toCharArray();
        for(int x=0;x<board.length;x++){
            for(int y=0;y<board[0].length;y++){
               if(exist(board,ch,x,y,0))
                   return true;
            }
        }
        return false;
    }
    
    public boolean exist(char[][] board,char[] ch,int x,int y,int i){
        if(i==ch.length)
            return true;
        if(x<0 || y<0 || x==board.length || y==board[0].length)
            return false;
        if(board[x][y]!=ch[i])
            return false;
        
        board[x][y]^=56;
        boolean exist=exist(board,ch,x+1,y,i+1) || exist(board,ch,x-1,y,i+1) || exist(board,ch,x,y+1,i+1) || exist(board,ch,x,y-1,i+1);
        board[x][y]^=56;
        return exist;
    }
}