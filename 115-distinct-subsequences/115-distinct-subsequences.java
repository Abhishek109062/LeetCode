class Solution {
    public int numDistinct(String s, String t) {
        int[][] memo = new int[s.length() + 1][t.length() + 1];
        for(int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return recursiveWithMemo(0, 0, s, t, memo);
        //return iterativeWithTabulation(s, t);
    }
    
    private int iterativeWithTabulation(String s, String t) {
        int M = s.length();
        int N = t.length();
        int[] tab = new int[N];
        for (int i = M - 1 ; i >= 0; i--) {
            int tij = 1;
            for(int j = N - 1; j >= 0; j--) {
                int oldj = tab[j];
                if (s.charAt(i) == t.charAt(j)) {
                    tab[j] += tij;
                }
                tij = oldj;
            }
        }
        return tab[0];
    }
    
    private int recursiveWithMemo(int i, int j, String s, String t, int[][]memo) {
        int M = s.length();
        int N = t.length();
        
        // Base case
        if (i == M || j == N || M - i < N - j) {
            return j == t.length() ? 1 : 0;
        }
        
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int ans = recursiveWithMemo(i + 1, j, s, t, memo);
        if (s.charAt(i) == t.charAt(j)) {
            ans += recursiveWithMemo(i + 1, j + 1, s, t, memo);
        } 
        memo[i][j] = ans;
        return memo[i][j];
    }
}