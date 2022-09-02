class Solution {
    int count = 0;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        // count = 0;
        permutations(0,nums,n-1,list);
        // System.out.println(count);
        return list;
    }
    void permutations(int l,int nums[],int r,List<List<Integer>> list){
        if(l==r){
            List<Integer> temp = new ArrayList<>();
            for(int e:nums) temp.add(e);
            list.add(temp);
            // count++;
            return;
        }
        for(int i=l;i<=r;i++){
            
            // if(l!=i && nums[l]==nums[l-1]) continue;
            // if(i!=l && nums[i]==nums[l]) continue;
            boolean check = ifSwapable(nums,i, l);
            if(check){
                swap(nums,i,l);
                permutations(l+1,nums,r,list);
                swap(nums,i,l);
            }
        }
    }
    void swap(int nums[],int i,int l){
        int t = nums[i];
        nums[i] = nums[l];
        nums[l] = t;
    }
    boolean ifSwapable(int nums[],int i,int l){
        
        for(int k = l;k<i;k++){
            if(nums[k]==nums[i]) return false;
        }
        return true;
    }

}