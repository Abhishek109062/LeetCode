class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        result[0]=1;
        for(int x=1;x<nums.length;x++)
            result[x]=result[x-1]*nums[x-1];
        int right=1;
        for(int x=nums.length-1;x>=0;x--){
            result[x]*=right;
            right*=nums[x];
        }
    return result;
    }
}