class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        if(matrix.length==0)
            return ans;
        
        int rowBegin=0;
        int rowEnd=matrix.length-1;
        int colBegin=0;
        int colEnd=matrix[0].length-1;
        
        while(rowBegin<=rowEnd && colBegin<=colEnd){
            for(int x=colBegin;x<=colEnd;x++)
                ans.add(matrix[rowBegin][x]);
            rowBegin++;
            for(int x=rowBegin;x<=rowEnd;x++)
                ans.add(matrix[x][colEnd]);
            colEnd--;
            
            if(rowBegin<=rowEnd){
                for(int x=colEnd;x>=colBegin;x--)
                    ans.add(matrix[rowEnd][x]);
                rowEnd--;
            }
            
            if(colBegin<=colEnd){
                for(int x=rowEnd;x>=rowBegin;x--)
                    ans.add(matrix[x][colBegin]);
                colBegin++;
            }
        }
        return ans;
    }
}