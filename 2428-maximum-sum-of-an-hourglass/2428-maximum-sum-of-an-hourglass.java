class Solution {
    public int maxSum(int[][] grid) {
        int sum = 0;
        for(int x = 1; x < grid.length-1; x++){
            for(int y = 1;y < grid[0].length-1; y++){
                int count = grid[x-1][y-1] + grid[x-1][y] + grid[x-1][y+1] + grid[x][y] + grid[x+1][y-1] + grid[x+1][y] + grid[x+1][y+1];
                sum = Math.max(count, sum);
            }
        }
        
        return sum;
    }
}