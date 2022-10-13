class Solution {
    public int findMinDifference(List<String> timepoints) {
        int len = timepoints.size();
        int[] time = new int[len];
        int i = 0;
        int max = 24*60;
        for(String s : timepoints)
            time[i++] = Integer.parseInt(s.substring(0,2))*60 + Integer.parseInt(s.substring(3));
        
        Arrays.sort(time);
        int min = max + time[0] - time[len-1];
        for(int x = 0; x < len-1; x++){
            int temp = Math.min((time[x+1] - time[x]), max+time[x]-time[x+1]);
            min = Math.min(min, temp);
        }
        
        return min;
    }
}