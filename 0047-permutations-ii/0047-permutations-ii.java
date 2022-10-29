class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, ans, 0);
        return ans;
    }
    
    public void permute(int[] nums, List<List<Integer>> ans, int i){
        if(i == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int tr : nums)
                temp.add(tr);
            ans.add(temp);
            return;
        }
        
        for(int x = i; x < nums.length; x++){
            if(isSwap(nums, i, x)){
                swap(nums, x, i);
                permute(nums, ans, i+1);
                swap(nums, x, i);
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public boolean isSwap(int[] nums, int i, int j){
        for(int x = i; x < j; x++)
            if(nums[x] == nums[j])
                return false;
        
        return true;
    }
}