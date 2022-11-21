class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    
    public void generate(List<List<Integer>> ans, List<Integer> temp, int[] cand, int target, int ind){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        
        if(target < 0)
            return;
        
        
        for(int x = ind; x < cand.length; x++){
            temp.add(cand[x]);
            generate(ans, temp, cand, target - cand[x], x);
            temp.remove(temp.size() - 1);
        }
    }
}