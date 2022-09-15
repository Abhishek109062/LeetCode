class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0)
            return new int[0];
        
        int row = 0, col = 0, m = mat.length , n = mat[0].length , temp[] = new int[m*n];
        
        for(int x = 0; x < temp.length ;x++){
            temp[x] = mat[row][col];
            if((row+col) % 2 == 0){
                if(col == n-1)
                    row++;
                else if(row == 0)
                    col++;
                else{
                    row--;
                    col++;
                }
            }
            
            else{
                if(row == m-1)
                    col++;
                else if(col == 0)
                    row++;
                else{
                    row++;
                    col--;
                }
            }
        }
        return temp;
    }
}