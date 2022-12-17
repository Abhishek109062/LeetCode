class Solution {
    public int evalRPN(String[] tokens) {
        int i = 0;
        int ans = 0;
        Stack<Integer> temp = new Stack<>();
        while(i < tokens.length){
            if(tokens[i].equals("*")){
                ans = temp.pop() * temp.pop();
                temp.push(ans);
            }
            else if(tokens[i].equals("+")){
                ans = temp.pop() + temp.pop();
                temp.push(ans);
            }
            else if(tokens[i].equals("/")){
                int ste = temp.pop();
                ans = temp.pop() / ste;
                temp.push(ans);
            }
            else if(tokens[i].equals("-")){
                ans = -1 * temp.pop() + temp.pop();
                temp.push(ans);
            }
            else 
                temp.push(Integer.parseInt(tokens[i]));
                          
            i++;
                          
        }
        
        if(tokens.length == 1){
            ans += temp.pop();
        }
            
        return ans;
    }
    
    
}