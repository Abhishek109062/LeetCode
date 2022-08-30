class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        boolean[] flag=new boolean[nums.length];
        per(nums,ans,temp,flag,nums.length);
        return ans;
    }
    public void per(int[] nums,List<List<Integer>> ans, List<Integer> temp,boolean flag[],int len){
        if(temp.size()==len){
            ans.add(new ArrayList<>(temp));
            return;
        }        
        for(int x=0;x<len;x++){
            if(!flag[x]){
                flag[x]=true;
                temp.add(nums[x]);
                per(nums,ans,temp,flag,len);
                temp.remove(temp.size()-1);
                flag[x]=false;
                
            }
        }
        
    }
}