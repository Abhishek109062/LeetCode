class Solution {
    String[] tokens;
    int endIndex;
    public int evalRPN(String[] tokens) {
        this.tokens = tokens;
        endIndex = tokens.length - 1;
        return solve();
    }
    
    private int solve() {
        while(endIndex >= 0) {
            String s = tokens[endIndex--];
            if(s.equals("*")) {
                int sol = solve() * solve();
                return sol;
            } else if(s.equals("/")) {
                int right = solve();
                int left = solve();
                int sol = left / right;
                return sol;
            } else if(s.equals("+")) {
                int sol = solve() + solve();
                return sol;
            } else if(s.equals("-")) {
                int right = solve();
                int left = solve();
                int sol = left - right;
                return sol;
            } else {
                return Integer.valueOf(s);
            }
        }
        return -1;
    }
}