class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        find(ans, new ArrayList<>(), n, k, 1);
        return ans;
    }
    
    public void find(List<List<Integer>> ans, List<Integer> temp, int sum, int k, int start){
        if(sum == 0 && k == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i = start; i <= 9; i++){
            temp.add(i);
            find(ans, temp, sum - i, k - 1, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}