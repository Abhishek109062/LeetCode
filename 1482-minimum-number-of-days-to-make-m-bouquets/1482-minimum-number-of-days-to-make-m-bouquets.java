class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = 1, len = bloomDay.length, right = 1_000_000_000;
        if(k*m > len)
            return -1;
        
        int ans = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            
            int kflower = 0;
            int kbouq = 0;
            for(int x = 0; x < len; x++){
                if(bloomDay[x] > mid)
                    kflower = 0;
                else if(++kflower >= k){
                    kbouq++;
                    kflower = 0;
                }
            }
            
            if(kbouq < m)
                left = mid + 1;
            else{
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
    
}