class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(ans, nums, 0);
        return ans;
    }
    
    public void generate(List<List<Integer>> ans, int[] nums, int ind){
        if(ind == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int x = 0; x < nums.length; x++)
                temp.add(nums[x]);
            
            ans.add(temp);
            return;
        }
        
        for(int x = ind; x < nums.length; x++){
            swap(nums, ind, x);
            generate(ans, nums, ind + 1);
            swap(nums, ind, x);
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}