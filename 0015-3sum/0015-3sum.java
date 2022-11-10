class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        for(int x = 0; x < len - 1; x++){
            int i = x + 1;
            int j = len - 1;
            int sum = nums[x];
            while(i < j){
                if(sum + nums[i] + nums[j] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[x]);
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    ans.add(temp);
                    
                    while(i < len - 1 && nums[i] == nums[i+1])
                        i++;
                    
                    while(j > 0 && nums[j] == nums[j-1])
                        j--;
                    
                    i++;
                    j--;
                }
                else if(sum + nums[i] + nums[j] > 0)
                    j--;
                else
                    i++;
            }
            
            while(x < len - 1 && nums[x] == nums[x+1])
                x++;
        }
        
        return ans;
    }
}