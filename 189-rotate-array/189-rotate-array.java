class Solution {
    public void rotate(int[] nums, int k) {
        if(nums==null || nums.length<2)
            return;
       
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k%nums.length-1);
        reverse(nums,k%nums.length,nums.length-1);
        
    }
    
    public void reverse(int nums[],int i ,int j)
    {
        int temp=0;
        while(i<j)
        {
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return;
    }
}