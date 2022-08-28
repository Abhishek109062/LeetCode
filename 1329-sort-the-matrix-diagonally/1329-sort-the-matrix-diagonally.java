class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int len=mat.length;
        int len2=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> temp=new HashMap<>();
        for(int x=0;x<len;x++){
            for(int y=0;y<len2;y++){
                //if(y==0)
                    temp.putIfAbsent(x-y,new PriorityQueue<>());
                temp.get(x-y).add(mat[x][y]);
            }
        }
        for(int x=0;x<len;x++){
            for(int y=0;y<len2;y++)
                mat[x][y]=temp.get(x-y).poll();
        }   
        return mat;
    }
}