class Solution {
    public int surfaceArea(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        
        int ans = 0;
        for(int x = 0; x < row; x++){
            for(int y = 0; y < col; y++){
                if(grid[x][y] != 0){
                    ans += 4 * grid[x][y] + 2;
                    
                    if(x > 0)
                        ans -= Math.min(grid[x-1][y], grid[x][y])*2;
                    
                    if(y > 0)
                        ans -= Math.min(grid[x][y-1], grid[x][y])*2;
                }
            }
        }
        
        return ans;
    }
}