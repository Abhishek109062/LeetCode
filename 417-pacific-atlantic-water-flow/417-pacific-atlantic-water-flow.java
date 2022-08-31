class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        
        for (int y = 0; y < m; y++) {
            dfs(heights, pacific, 0, y, 0);
            dfs(heights, atlantic, n-1, y, 0);
        }
        for (int x = 0; x < n; x++) {
            dfs(heights, pacific, x, 0, 0);
            dfs(heights, atlantic, x, m-1, 0);
        }
        
        List<List<Integer>> result = new ArrayList<>();
        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (pacific[y][x] && atlantic[y][x]) {
                    List<Integer> next = new ArrayList<>();
                    next.add(y);
                    next.add(x);
                    result.add(next);
                }
            }
        }
        return result;
    }
    
    private void dfs(int[][] heights, boolean[][] ocean, int x, int y, int prev) {
        int m = heights.length, n = heights[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m || ocean[y][x] || heights[y][x] < prev) return;
        ocean[y][x] = true;
        dfs(heights, ocean, x+1, y, heights[y][x]);
        dfs(heights, ocean, x, y+1, heights[y][x]);
        dfs(heights, ocean, x-1, y, heights[y][x]);
        dfs(heights, ocean, x, y-1, heights[y][x]);
    }
}