class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> obj=new ArrayList();
        for(int x=0,y=0;x<A.length && y<B.length;){
            int begin=Math.max(A[x][0],B[y][0]);
            int end=Math.min(A[x][1],B[y][1]);
            
            if(begin<=end)
                obj.add(new int[]{begin,end});
            if(A[x][1]<B[y][1])
                x++;
            else
                y++;
        }
        
        return obj.toArray(new int[0][]);
    }
}