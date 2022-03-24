class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ar[]={-1,-1};
        for(int x=0;x<nums.length;x++){
            if(nums[x]==target){
                ar[0]=x;
                for(int y=x;y<nums.length;y++){
                    if(nums[y]==target)
                        ar[1]=y;
                }
                break;
            }    
        }
        
        return ar;
    }
}