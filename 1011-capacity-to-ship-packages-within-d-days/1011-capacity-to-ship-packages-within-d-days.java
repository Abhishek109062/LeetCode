class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i = 0;
        int j = Integer.MAX_VALUE;
        
        while(i < j){
            int mid = i - (i - j)/2;
            
            if(possible(weights, mid, days))
                j = mid;
            else
                i = mid+1;
        }
        
        return j;
    }
    
    public boolean possible(int[] weights, int ans, int days){
        int i = 1;
        int sum = 0;
        // System.out.println(ans);
        for(int x : weights){
            if(ans < x)
                return false;
            if(ans < sum + x){
                i++;
                sum = x;
            }
            else
                sum += x;
        }
        
        return i <= days;
    }
}