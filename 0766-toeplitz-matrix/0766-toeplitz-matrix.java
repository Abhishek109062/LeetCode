class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int x = 0; x < matrix.length - 1; x++){
            for(int y = 0; y < matrix[0].length - 1; y++)
                if(matrix[x][y] != matrix[x+1][y+1])
                    return false;
        }
        
        return true;
    }
}