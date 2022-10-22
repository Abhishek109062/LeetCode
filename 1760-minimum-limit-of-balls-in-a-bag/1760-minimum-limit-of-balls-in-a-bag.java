class Solution {
    public int minimumSize(int[] nums, int maxoper) {
        int min = 1;
        int max = 1000000000;
        
        int count = 0;
        while(min < max){
            int mid = (min+max)/2;
            for(int x : nums)
                count += (x-1)/mid;
            
            if(count > maxoper)
                min = mid+1;
            else
                max = mid;
            
            count = 0;
        }
        
        return min;
    }
}