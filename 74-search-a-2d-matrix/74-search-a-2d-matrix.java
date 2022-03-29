class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int x=matrix.length-1;x>=0;x--){
            if(matrix[x][0]<=target){
                System.out.println("hi");
                for(int y=0;y<matrix[x].length;y++){
                    if(matrix[x][y]==target)
                        return true;
                }
            }
            
        }
        return false;
    }
}