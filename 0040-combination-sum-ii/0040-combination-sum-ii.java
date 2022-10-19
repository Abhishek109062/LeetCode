class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(cand);
        find(ans, new ArrayList<>(),target, 0, cand);
        return ans;
    }
    
    public void find(List<List<Integer>> ans, List<Integer> temp,int target, int i, int[] ar){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int x = i; x < ar.length; x++){
            if(x != i && ar[x] == ar[x-1])
                continue;
            if((target - ar[x]) >= 0){
                temp.add(ar[x]);
                find(ans, temp, target - ar[x], x+1, ar);
                temp.remove(temp.size() - 1);
            }
        }
    }
}