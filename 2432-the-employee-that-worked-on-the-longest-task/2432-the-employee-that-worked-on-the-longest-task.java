class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int timemax = logs[0][1];
        int index = logs[0][0];
        for(int x = 1; x < logs.length; x++){
            int diff = logs[x][1] - logs[x-1][1];
            if(diff > timemax){
                timemax = diff;
                index = logs[x][0];
            }
            else if(diff == timemax && index > logs[x][0])
                index = logs[x][0];
        }
        
        return index;
    }
}