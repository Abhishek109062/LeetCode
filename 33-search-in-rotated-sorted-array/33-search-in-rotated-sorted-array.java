class Solution {
    public int search(int[] nums, int target) {
        
        int find=-1;
        if(nums.length==1)
            return target==nums[0]?0:-1;
        if(target<=nums[nums.length-1])
        {
            for(int x=nums.length-1;x>-1;x--)
            {
                if(nums[x]==target){
                    find=x;
                    break;
                }
                if(x-1>=0 && nums[x]<nums[x-1])
                   break;
            }
            
        }
        else{
            for(int x=0;x<nums.length-1;x++){
                if(nums[x]==target){
                    find=x;
                    break;
                }
                if(nums[x]>nums[x+1])
                    break;
            }
        }
        
        return find;
    }
}