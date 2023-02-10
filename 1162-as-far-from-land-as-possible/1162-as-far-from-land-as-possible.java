class Solution {
    public int maxDistance(int[][] grid) {
        int len = grid.length;
        int[][] ans = new int[len][len];
//         for(int x = 0; x < len; x++){
//             for(int y = 0; y < len; y++)
//                 ans[x][y] = 2000;
//         }
        
        
        int result = 0;
        boolean flag = false;
        for(int x = 0; x < len; x++){
            for(int y = 0; y < len; y++){
                if(grid[x][y] == 1)
                    continue;
                
                flag = true;
                ans[x][y] = 2000;
                if(y > 0)
                    ans[x][y] = Math.min(ans[x][y], ans[x][y-1] + 1);
                if(x > 0)
                    ans[x][y] = Math.min(ans[x][y], ans[x-1][y] + 1);
                
            }
        }
        
        
        for(int x = len-1; x >= 0; x--){
            for(int y = len-1; y >= 0; y--){
                if(grid[x][y] == 1)
                    continue;
                
                if(y < len - 1)
                    ans[x][y] = Math.min(ans[x][y], ans[x][y+1] + 1);
                if(x < len - 1)
                    ans[x][y] = Math.min(ans[x][y], ans[x+1][y] + 1);
                
                result = Math.max(result, ans[x][y]);
                
            }
        }
        if(flag)
        return result == 2000 ? -1 : result;
        else
            return -1;
    }
}