class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;
        
        //2D array to map plantTime and growTime
        int[][] temp = new int[n][2];
        for(int x = 0; x < n; x++){
            temp[x][0] = growTime[x];
            temp[x][1] = plantTime[x];
        }
        
        Arrays.sort(temp, (a,b)->(b[0] - a[0]));
        
        int ans = 0;
        int time = 0;
        for(int x = 0; x < n; x++){
            time += temp[x][1];
            ans = Math.max(ans, time + temp[x][0]);
        }
        return ans;
    }
}