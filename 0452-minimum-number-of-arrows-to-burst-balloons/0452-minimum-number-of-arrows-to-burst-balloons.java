class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) ->
            Integer.compare(a[0], b[0])

         );
        
        // for(int x[]: points){
        //     for(int y: x)
        //         System.out.print(y);
        //     System.out.println();
        // }
        
        int count = 0;
        int respos = points[0][1];
        for(int x = 1; x < points.length; x++){
            if(respos >= points[x][0]);
            else{
                count++;
                respos=points[x][1];
                continue;
            }
            respos = Math.min(points[x][1], respos);
        }
        
        return count+1;
    }
}