class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int x=0;x<9;x++){
            HashSet<Character> rows=new HashSet<>();
            HashSet<Character> cols=new HashSet<>();
            HashSet<Character> cube=new HashSet<>();
            for(int y=0;y<9;y++){
                if(board[x][y]!='.' && !rows.add(board[x][y]))
                    return false;
                if(board[y][x]!='.' && !cols.add(board[y][x]))
                    return false;
                int RowIndex = 3*(x/3);
            int ColIndex = 3*(x%3);
            if(board[RowIndex + y/3][ColIndex + y%3]!='.' && !cube.add(board[RowIndex + y/3][ColIndex+ y%3]))
                return false;
                
            }
        }
        return true;
    }
}