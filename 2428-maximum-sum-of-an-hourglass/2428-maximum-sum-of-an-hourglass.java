class Solution {
    private int hourglassSum(int[][] grid, int row, int col) {
        int result = 0;

        result += grid[row-1][col-1];
        result += grid[row-1][col];
        result += grid[row-1][col+1];
        result += grid[row][col];
        result += grid[row+1][col-1];
        result += grid[row+1][col];
        result += grid[row+1][col+1];

        return result;
    }

    public int maxSum(int[][] grid) {
        int result = -1;
        for (int i = 1; i < grid.length - 1; i++) {
            for (int j = 1; j < grid[0].length - 1; j++) {
                int sum = hourglassSum(grid, i, j);
                if (result < sum) {
                    result = sum;
                }
            }
        }

        return result;
    }
}