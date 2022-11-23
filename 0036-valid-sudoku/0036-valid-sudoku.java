class Solution {
         public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                   if(!isvalid(board,i,j))
                       return false;
                }
            }   
        }
        return true;
    }
    
    public boolean isvalid(char[][] board,int row, int col){
        int start=0;
        int end=0;
        for(int i=0;i<9;i++){
            if(board[i][col]==board[row][col] && i!=row)
                return false;
            if(board[row][i]==board[row][col] && i!=col)
                return false;
            start=row/3;
            end=col/3;
            start=start*3;
            end=end*3;
            if(board[start+i/3][end+i%3]==board[row][col] && ((start+i/3)!=row &&(end+i%3)!=col))
                return false;
            
        }
        return true;
    }
}