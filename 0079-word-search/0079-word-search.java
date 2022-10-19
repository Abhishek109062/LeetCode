class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        
        for(int r = 0; r < m; r++)
            for(int c = 0; c < n; c++)
                if(board[r][c] == word.charAt(0)){
                    if(backtrack(board, m, n, r, c, word, 0))
                    return true;
                }
        
        return false;
    }
    
    public boolean backtrack(char[][] board, int m, int n, int r, int c, String word, int charIndx){
        
        if(word.length() == charIndx)
            return true;
        
        if(r < 0 || r >= m || c < 0 || c >= n)
            return false;
        
        if(board[r][c] != word.charAt(charIndx))
            return false;
        
        board[r][c] = '@'; 
        
        if(backtrack(board, m, n, r, c+1, word, charIndx+1)
          || backtrack(board, m, n, r, c-1, word, charIndx+1)
          || backtrack(board, m, n, r+1, c, word, charIndx+1)
          || backtrack(board, m, n, r-1, c, word, charIndx+1))
            return true;
        
        board[r][c] = word.charAt(charIndx); 
        return false;
    }
}