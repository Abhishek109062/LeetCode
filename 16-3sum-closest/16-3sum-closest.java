class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        for(int x=0;x<nums.length;x++){
            int st=x+1;
            int en=nums.length-1;
            while(st<en){
                int num=nums[x]+nums[st]+nums[en];
                if(num>target)
                    en--;
                else
                    st++;
                
                if(Math.abs(result-target)>Math.abs(num-target))
                    result=num;
            }
        }
        return result;
    }
}