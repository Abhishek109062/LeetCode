class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length-1;
        while(k>1){
            len--;
            k--;
        }
        return nums[len];
    }
}