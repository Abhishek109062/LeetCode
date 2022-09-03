class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]='.';
        
        List<List<String>> ans=new ArrayList<List<String>>();
        int leftrow[]=new int[n];
        int lowerdiagonal[]=new int[2*n-1];
        int upperdiagonal[]=new int[2*n-1];
        solver(0,board,ans,leftrow,lowerdiagonal,upperdiagonal);
        return ans;
    }    
        
        
        
     public void solver(int col, char[][] board,List<List<String>> ans,int[] leftrow,int[] lowerdiagonal,int [] upperdiagonal){
    
         if(col==board.length){
             ans.add(adder(board));
             return;
         }
         
    for(int row=0;row<board.length;row++ ){
        if(leftrow[row]==0 && lowerdiagonal[row+col]==0 && upperdiagonal[board.length-1+row-col]==0){
            board[row][col]='Q';
            leftrow[row]=1;
            lowerdiagonal[row+col]=1;
            upperdiagonal[board.length-1+row-col]=1;
            solver(col+1,board,ans,leftrow,lowerdiagonal,upperdiagonal);
            board[row][col]='.';
            leftrow[row]=0;
            lowerdiagonal[row+col]=0;
            upperdiagonal[board.length-1+row-col]=0;
        }
    }         
 }
       
public List<String>   adder(char [][]board){
       /* List<String> ds=new ArrayList<String>();
        for(int i=0;i<board.length;i++){
            ds.add(board[i]);
        }
        return ds;*/
    List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
    }
    return res;
}
}