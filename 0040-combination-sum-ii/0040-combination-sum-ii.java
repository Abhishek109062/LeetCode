class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        combi(ans, 0, candidates, target, new ArrayList<>());
        return ans;
    }
    
    public void combi(List<List<Integer>> ans, int i, int[] ar, int target, List<Integer> temp)     {
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        
        for(int x = i; x < ar.length; x++){
            if(x != i && ar[x-1] == ar[x])
                continue;
            
            if(target - ar[x] >= 0){
                temp.add(ar[x]);
                combi(ans, x+1, ar, target - ar[x], temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}