class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> obj  = new HashSet<>();
        for(int x=0;x<nums.length-2;x++)
        {   
            int y=x+1,z=nums.length-1;
            while(y<z)
            {
                int sum=nums[x]+nums[y]+nums[z];
                if(sum==0)
                    obj.add(Arrays.asList(nums[x],nums[y++],nums[z--]));
                else if(sum<0)
                    y++;
                else if(sum>0)
                    z--;
            }
            
        }
        
        return new ArrayList<>(obj);
        
    }
}