class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        
        int len = matrix.length;
        int len2 = matrix[0].length;
        
        for(int x = 0; x < len; x++){
            for(int y = 0; y < len2; y++){
                if(matrix[x][y] == 0){
                    if(x == 0)
                    firstRow = true;
                    if(y == 0)
                    firstCol = true;
                    
                    matrix[x][0] = 0;
                    matrix[0][y] = 0;
                }
            }
        }
        
        
        for(int x = 1; x < len; x++){
            for(int y = 1; y < len2; y++){
                if(matrix[x][0] == 0 || matrix[0][y] == 0)
                    matrix[x][y] = 0;
            }
        }
        
        if(firstCol){
            for(int x = 0; x < len; x++){
                matrix[x][0] = 0;
            }
        }
        
        if(firstRow){
            for(int x = 0; x < len2; x++){
                matrix[0][x] = 0;
            }
        }
    }
}