class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        sub(nums,0,nums.length,ans,new ArrayList<Integer>());
        return ans;
    }
    public void sub(int[] nums,int i,int len,List<List<Integer>> ans, List<Integer> temp){
            ans.add(new ArrayList<>(temp));
        
        int x;
        for( x=i;x<len;x++){
            if(x!=i && nums[x]==nums[x-1])
                continue;
            temp.add(nums[x]);
            sub(nums,x+1,len,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}