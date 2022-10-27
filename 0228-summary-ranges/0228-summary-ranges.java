class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        
        for(int x = 0; x < nums.length; x++){
            int a = nums[x];
            while(x+1 < nums.length && nums[x+1] == nums[x] + 1)
                x++;
            
            if(a != nums[x])
                ans.add(a+"->"+nums[x]);
            else
                ans.add(a+"");
        }
        
        return ans;
    }
}