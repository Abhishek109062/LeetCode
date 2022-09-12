class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> ans = new Stack<>();
        int count = 0;
        int result = 0;
        ans.push(-1);
        for(int x = 0 ;x < s.length() ;x++){
            if(s.charAt(x) == ')' && ans.size() > 1 && s.charAt(ans.peek()) == '('){
                ans.pop();
                result = Math.max(result, x-ans.peek());
            }
            else
                ans.push(x);
        }
        return result;
    }
}