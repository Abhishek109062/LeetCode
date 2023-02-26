class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
            int mid = nums.length/2;
        int j = mid;
        int count = 0;
        
        while(i < mid && j < nums.length){
            if(nums[i]*2 <= nums[j]){
                count += 2;
                i++;
                j++;
            }
            else{
                j++; 
            }
        }
        
        return count;
    }
}