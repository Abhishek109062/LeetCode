class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        //ans.add(new ArrayList<Integer>());
        sub(nums,0,nums.length,ans,new ArrayList<Integer>());
        return ans;
    }
    
    public void sub(int[] nums,int i,int len,List<List<Integer>> ans,List<Integer> temp){
        if(i==len)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }
        sub(nums,i+1,len,ans,new ArrayList<>(temp));
        temp.add(nums[i]);
        sub(nums,i+1,len,ans,new ArrayList<>(temp));
    
        }
}