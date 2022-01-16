class Solution {
    public int[] moveZeroes(int[] nums) {
       int count=0; 
       for(int x=0;x<nums.length;x++)
       {
           if(nums[x]!=0)
           {
               if(nums[count]==0)
               {
                   nums[count++]=nums[x];
                   nums[x]=0;
               }
               else
                   nums[count++]=nums[x];
           }
           
       }
        return nums;
    }
}