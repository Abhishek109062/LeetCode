class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=nums.length-1;
        for(int x=0;x<=j;x++){
            if(nums[x]==0){
                nums[x]=nums[i];
                nums[i]=0;
                i++;
            }
            if(nums[x]==2){
                nums[x]=nums[j];
                nums[j]=2;
                j--;
                x--;
            }
        }
    }
}