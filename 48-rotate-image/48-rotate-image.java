class Solution {
    public void rotate(int[][] matrix) {
        for(int x=0;x<matrix.length;x++)
        {
            for(int y=x;y<matrix.length;y++)
            {
                int temp=matrix[x][y];
                matrix[x][y]=matrix[y][x];
                matrix[y][x]=temp;
            }
        }
        
        for(int x=0;x<matrix.length;x++)
        {
            for(int y=0;y<matrix.length/2;y++)
            {
                int temp=matrix[x][y];
                matrix[x][y]=matrix[x][matrix.length-1-y];
                matrix[x][matrix.length-1-y]=temp;
            }
        }
        
    }
}