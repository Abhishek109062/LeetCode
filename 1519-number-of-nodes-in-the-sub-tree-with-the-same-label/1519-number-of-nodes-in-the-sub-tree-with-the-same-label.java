class Solution {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        List<Integer>[] temp = new ArrayList[n];
        
        for(int x = 0; x < n; x++)
            temp[x] = new ArrayList<>();
        
        for(int x[] : edges){
            temp[x[0]].add(x[1]);
            temp[x[1]].add(x[0]);
        }
        
        boolean visit[] = new boolean[n];
        // Map<Character, Interger> ans = new HashMap<>();
        int ans[] = new int[n];
        dfs(0, visit, temp, ans, labels);
        return ans;
    }
    
    public int[] dfs(int x, boolean[] visit, List<Integer>[] temp, int ans[], String s){
        int count[] = new int[26];
        if(!visit[x]){
            visit[x] = true;
            char ch = s.charAt(x);
            for(int tr: temp[x]){
                int countpp[] = dfs(tr, visit, temp, ans, s);
                
                for(int y = 0; y < 26; y++)
                    count[y] += countpp[y]; 
            }
            
            ++count[ch - 'a'];
            ans[x] = count[ch - 'a'];
        }
        
        return count;
    }
}