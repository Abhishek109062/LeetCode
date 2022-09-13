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
        while(!ans.isEmpty()){
            int temp = ans.pop();
            if(temp == s.length()-1)
                s = s.substring(0,temp);
            else
                s = s.substring(0,temp) + s.substring(temp+1);
        }
        return s;       
    }
}