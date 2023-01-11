class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<Integer>[] temp = new ArrayList[n];
        
        for(int x = 0; x < n; x++)
            temp[x] = new ArrayList<>();
        
        for(int x[] : edges){
            temp[x[0]].add(x[1]);
            temp[x[1]].add(x[0]);
        }
        
        boolean visit[] = new boolean[n];
        
        return dfs(0, visit, temp, hasApple);
    }
    
    
    public int dfs(int x,boolean[] visit, List<Integer>[] temp, List<Boolean> has){
        if(visit[x])
            return 0;
        
        visit[x] = true;
        
        int ans = 0;
        for(int tr : temp[x]){
            ans += dfs(tr, visit, temp, has);
        }
        
        
        if(x == 0)
            return ans;
        
        if(has.get(x) || ans > 0)
            return ans + 2;
        
        return 0;
    }
}