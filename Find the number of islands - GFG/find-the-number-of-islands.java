// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        int number=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int x=0;x<row;x++){
            for(int y=0;y<col;y++){
                if(grid[x][y]=='1'){
                    visited(grid,x,y,row,col);
                    number++;
                }
            }
        }
        return number;
    }
    
    public void visited(char[][] grid,int x,int y,int row,int col){
        if(x<0 || x>=row || y<0 || y>=col || grid[x][y]!='1')
        return;
        
        grid[x][y]='2';
        visited(grid,x+1,y,row,col);
        visited(grid,x-1,y,row,col);
        visited(grid,x,y+1,row,col);
        visited(grid,x,y-1,row,col);
        visited(grid,x+1,y+1,row,col);
        visited(grid,x-1,y-1,row,col);
        visited(grid,x+1,y-1,row,col);
        visited(grid,x-1,y+1,row,col);
    }
}