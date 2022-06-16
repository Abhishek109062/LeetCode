class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        
        int leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            leftProduct *= nums[i];
            max = Math.max(max, leftProduct);
            if (leftProduct == 0) {
                leftProduct = 1;
            }
        } 
        
        int rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            rightProduct *= nums[i];
            max = Math.max(max, rightProduct);
            if (rightProduct == 0) {
                rightProduct = 1;
            }
        } 
        
        return max;
    }
}