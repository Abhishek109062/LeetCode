class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if (dist.length - 1 >= hour) return -1;
        int low = 1, high = Arrays.stream(dist).max().getAsInt() * 100;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (timeNeeded(dist, mid) <= hour) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    
    private double timeNeeded(int[] dist, int speed) {
        int ans = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            ans += (dist[i] - 1) / speed + 1;
        }
        return ans + (double)(dist[dist.length - 1]) / speed;
    }
}