class Solution {
    public int maxSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if(row < 3 || col < 3)
            return 0;
        
        int sum = 0;
        for(int x = 0; x < row-2; x++){
            for(int y = 0;y < col-2; y++){
                int count = grid[x][y] + grid[x][y+1] + grid[x][y+2] + grid[x+1][y+1] + grid[x+2][y] + grid[x+2][y+1] + grid[x+2][y+2];
                sum = Math.max(count, sum);
            }
        }
        
        return sum;
    }
}