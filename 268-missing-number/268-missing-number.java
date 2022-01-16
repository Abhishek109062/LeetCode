import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        for(int x=nums.length-1;x>=0;x--)
        {
            n=n^(nums[x]^x);
        }
        return n;
    }
}