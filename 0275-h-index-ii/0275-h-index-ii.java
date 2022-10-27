class Solution {
    public int hIndex(int[] cit) {
        int len = cit.length;
        
        int low = 0, high = len - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            
            if(cit[mid] == len - mid)
                return cit[mid];
            else if(cit[mid] < len - mid)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return len - low;
    }
}