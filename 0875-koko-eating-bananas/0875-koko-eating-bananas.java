class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1000000000;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            
            if(possible(piles, mid, h))
                high = mid - 1;
            else
                low = mid + 1;
        }
        
        return low;
    }
    
    public boolean possible(int[] piles, int n, int h){
        long count = 0;
        for(int x : piles){
            count += x/n;
            if(x%n != 0)
                count++;
        }
        
        return count <= h;
    }
}