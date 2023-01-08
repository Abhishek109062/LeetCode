class Solution {
    public int maxPoints(int[][] points) {
        Map<Double, Integer> temp = new HashMap<>();
        int max = 1;
        for(int x = 0; x < points.length; x++){
            temp = new HashMap<>();
            for(int y = x+1; y < points.length; y++){
                
                double slope = (double)(points[x][1] - points[y][1])/(points[x][0] - points[y][0]);
                if(slope == -0)
                    slope = 0.0;
                
                if(slope == Double.NEGATIVE_INFINITY)
                    slope = Double.POSITIVE_INFINITY;
                
                if(temp.containsKey(slope))
                    temp.put(slope, temp.put(slope, 0) + 1);
                else
                    temp.put(slope, 2);
                
                max = Math.max(max, temp.get(slope));
            }
        }
        
        return max;
    }
}