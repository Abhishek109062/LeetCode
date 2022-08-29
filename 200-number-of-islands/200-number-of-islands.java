class Solution {
    public int numIslands(char[][] grid) {
        int len=grid.length;
        int len2=grid[0].length;
        int count=0;
        for(int x=0;x<len;x++){
            for(int y=0;y<len2;y++){
                if(grid[x][y]=='1'){
                    island(x,y,len,len2,grid);
                count++;
                }
            }
        }
        return count;
    }
    
    public void island(int i,int j,int len,int len2,char[][] grid){
        if(i<0 || j<0 || j>=len2 || i>=len || grid[i][j]!='1')
            return;
        
        grid[i][j]='0';
        
        island(i+1,j,len,len2,grid);
        island(i,j+1,len,len2,grid);
        island(i-1,j,len,len2,grid);
        island(i,j-1,len,len2,grid);
    }
}