class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int left[] = new int[len];
        int right[] = new int[len];
        
        left[0] = nums[0];
        right[len - 1] = nums[len - 1];
        for(int x = 1; x < len; x++){
            left[x] = nums[x] + left[x-1];
            right[len - x - 1] = nums[len - x - 1] + right[len - x];
        }
        // for(int x: right)
        //     System.out.println(x);
        
        for(int x = 0; x < len; x++)
            if(left[x] == right[x])
                return x;
        
        
        return -1;
    }
}