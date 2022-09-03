class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permute(nums,ans,0,nums.length);
        return ans;
    }
    public void permute(int[] nums,List<List<Integer>> ans,int i,int len){
        if(i==len){
            List<Integer> temp=new ArrayList<>();
            for(int t:nums)
                temp.add(t);
            ans.add(temp);
            return;
        }
        
        for(int x=i;x<len;x++){
            swap(nums,x,i);
            permute(nums,ans,i+1,len);
            swap(nums,x,i);
        }
    }
    public void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    // public boolean isSwappable(boolean flag[] ,int i ,int j){
    //     if( !flag[j]){
    //         return true;
    //     }
    //     return false;
    // }
    
}