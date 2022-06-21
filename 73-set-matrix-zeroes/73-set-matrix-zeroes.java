class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int i=1;
        for(int x=0;x<n;x++){
            if(matrix[x][0]==0)
                i=0;
            for(int y=1;y<m;y++){
                if(matrix[x][y]==0){
                    matrix[x][0]=0;
                    matrix[0][y]=0;
                }
            }
        }
        
        for(int x=n-1;x>=0;x--){
            for(int y=m-1;y>=1;y--){
                if(matrix[x][0]==0 || matrix[0][y]==0)
                    matrix[x][y]=0;
            }
            
            if(i==0)
                matrix[x][0]=0;
        }
    }
}