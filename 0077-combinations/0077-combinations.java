class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        
        combi(ans, new ArrayList<>(), k, n, 1);
        return ans;
    }
    
    
    public void combi(List<List<Integer>> ans, List<Integer> temp, int k, int n,int i){
        if(k == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        
        for(int x = i; x <= n; x++){
            temp.add(x);
            combi(ans, temp, k-1, n, x+1);
            temp.remove(temp.size() - 1);
        }
    }
}