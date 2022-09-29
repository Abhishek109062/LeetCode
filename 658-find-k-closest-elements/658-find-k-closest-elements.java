class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int n) {
        List<Integer> ans = new ArrayList<>();
        int len = arr.length;
        
        
            int low = 0;
            int high = len-1;
            while(high - low >=k){
                if(Math.abs(arr[low] - n) > Math.abs(arr[high] - n) )
                    low++;
                else 
                    high--;
            }
            
            for(int x = low; x <= high; x++)
                ans.add(arr[x]);
        return ans;
    }
}