class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> ans = new Stack();
        
        for(int x = 0; x < s.length(); x++){
            char ch = s.charAt(x);
            if(ch == ')' || ch == '('){
            if(ch == ')' && ans.size() >= 1 && s.charAt(ans.peek()) == '(')
                ans.pop();
            else
                ans.push(x);
            }
        }
        //System.out.println(ans);
        
        StringBuilder ss = new StringBuilder(s);
        while(!ans.isEmpty())
            ss.setCharAt(ans.pop(),'!');
            
            
        return ss.toString().replaceAll("\\!","");
        
    }
}