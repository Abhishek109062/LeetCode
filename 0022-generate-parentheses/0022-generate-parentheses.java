class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        build(ans, n, 0, 0, "");
        return ans;
    }
    
    public void build(List<String> ans, int n, int open, int close, String make){
        if(n == close){
            ans.add(make);
            return;
        }
        
        
        if(open < n){
            build(ans, n, open+1, close, make + "(");
        }
        
        if(close < open){
            build(ans, n, open, close + 1, make + ")" );
        }
    }
}