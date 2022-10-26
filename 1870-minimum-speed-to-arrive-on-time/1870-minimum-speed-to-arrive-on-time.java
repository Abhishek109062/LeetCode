class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left = 0, right = 1000000000;
        
        int ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            double sum = 0.0;    
            for(int x = 0; x < dist.length-1; x++)
                sum += Math.ceil((double)dist[x] / mid);
            
            sum += (double)dist[dist.length - 1] / mid;
            
            if(sum <= hour){
                ans = mid;
                right = mid - 1;
            }
            else
                left = mid + 1;
        }
        return ans;
    }
}