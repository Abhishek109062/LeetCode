class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        
        
        arr[0] = 1;
        for(int x = 1; x < arr.length; x++){
            if(arr[x] - arr[x-1] > 1){
                arr[x] = arr[x-1] + 1;
            }
        }
        
        return arr[arr.length - 1];
    }
}