class Solution {
    public int findMinDifference(List<String> timepoints) {
        int len = timepoints.size();
        int[] time = new int[len];
        int i = 0;
        // int max = 24*60;
        for(String s : timepoints){
            int h = (s.charAt(0) - '0')*10 + (s.charAt(1) - '0');
            int m = (s.charAt(3) - '0')*10 + (s.charAt(4) - '0');
            time[i++] = h*60 + m;
        }
        
        Arrays.sort(time);
        int min = 24*60 + time[0] - time[len-1];
        for(int x = 0; x < len-1; x++){
            min = Math.min(min, time[x+1]-time[x]);
        }
        
        return min;
    }
}