class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int coln=grid[0].length;
        for(int x=0;x<row;x++){
            for(int y=0;y<coln;y++){
                if(x==0 && y==0);
                else if(x==0)
                    grid[x][y]+=grid[x][y-1];
                else if(y==0)
                    grid[x][y]+=grid[x-1][y];
                else
                    grid[x][y]+=Math.min(grid[x-1][y],grid[x][y-1]);
            }
        }
        return grid[row-1][coln-1];

    }
    
    }