class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0 && duration == 0)
            return 0;
        int total = 0;
        int start = timeSeries[0], end = timeSeries[0] + duration;
        for(int x = 1; x < timeSeries.length; x++){
            if(timeSeries[x] > end){
                total += end - start;
                start = timeSeries[x];
            }
            end = timeSeries[x] + duration;
        }
        total += end - start;
        
        return total;
    }
}