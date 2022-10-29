class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combi(ans, 0, target, new ArrayList<>(), candidates);
        return ans;
    }
    
    public void combi(List<List<Integer>> ans, int i, int target, List<Integer> temp, int[] ar){
        if(i == ar.length){
            if(target == 0)
                ans.add(new ArrayList<>(temp));
            return;
        }
        
        if(target >= ar[i]){
            temp.add(ar[i]);
            combi(ans, i, target - ar[i], temp, ar);
            temp.remove(temp.size() - 1);
        }
        combi(ans, i+1, target, temp, ar);
    }
}