class Solution {
    int[][] dir = {{1,-1},{1,0},{1,1},{0,-1},{0,1},{-1,-1},{-1,0},{-1,1}};
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        
        for(int x = 0; x < m; x++){
            for(int y = 0; y < n; y++){
                int count = 0;
                for(int[] z : dir){
                    if(z[0] + x < 0 || z[0] + x >= m || z[1] + y < 0 || z[1] + y >= n)
                        continue;
                    
                    if(board[z[0] + x][z[1] + y] == 1 || board[z[0] + x][z[1] + y] == 2)
                        count++;
                }
                
                if(board[x][y] == 1 && (count < 2 || count > 3))
                    board[x][y] = 2;
                if(board[x][y] == 0 && count == 3)
                    board[x][y] = 3;
            }
        }
        
        for(int x = 0; x < m; x++)
            for(int y = 0; y < n; y++)
                board[x][y] %= 2;
        
    }
}

