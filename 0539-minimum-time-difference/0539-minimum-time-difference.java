class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if (n > 24 * 60) return 0;
        
        int[] mins = new int[n];
        int i = 0;
        for (String tm : timePoints) {
            mins[i++] = getMin(tm);
        }
        Arrays.sort(mins);
        
        int res = mins[0] + 24 * 60 - mins[n - 1];  // donot forget this
        for (int j = 1; j < n; j++) {
            res = Math.min(res, mins[j] - mins[j - 1]);
        }
        return res;
    }
    
    private int getMin(String time) {
        int h = (time.charAt(0) -'0') * 10 + time.charAt(1) - '0';
        int m = (time.charAt(3) -'0') * 10 + time.charAt(4) - '0';
        
        return h * 60 + m;
    }
}