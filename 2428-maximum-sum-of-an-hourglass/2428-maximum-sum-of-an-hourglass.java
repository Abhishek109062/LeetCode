class Solution {
    public int maxSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if(row < 3 || col < 3)
            return 0;
        
        int sum = 0;
        for(int x = 1; x < row-1; x++){
            for(int y = 1;y < col-1; y++){
                int count = grid[x-1][y-1] + grid[x-1][y] + grid[x-1][y+1] + grid[x][y] + grid[x+1][y-1] + grid[x+1][y] + grid[x+1][y+1];
                sum = Math.max(count, sum);
            }
        }
        
        return sum;
    }
}