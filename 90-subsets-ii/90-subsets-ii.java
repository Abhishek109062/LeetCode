class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        sub(nums,0,nums.length,ans,new ArrayList<Integer>());
        return ans;
    }
    public void sub(int[] nums,int i,int len,List<List<Integer>> ans, List<Integer> temp){
        boolean flag=ans.contains(temp);
        if(i==len){
            if(!flag){
            ans.add(new ArrayList<>(temp));
            return;
            }
            else
                return;
        }
        
        // if(i>0 && nums[i-1]==nums[i]){
        //     sub(nums,i+1,len,ans,new ArrayList<>(temp));
        //     //sub(nums,i+1,len,ans,new ArrayList<>(temp));
        // }
        // else{
           sub(nums,i+1,len,ans,new ArrayList<>(temp));
            temp.add(nums[i]);
            sub(nums,i+1,len,ans,new ArrayList<>(temp));
            
        //}
        
    }
}