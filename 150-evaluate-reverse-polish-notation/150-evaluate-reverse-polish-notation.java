class Solution {
    public int evalRPN(String[] tokens) {
        Stack temp=new Stack();
        for(int x = 0; x < tokens.length ;x++){
            String s=tokens[x];
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int second=(int)temp.pop(); 
                int first=(int)temp.pop();
                int ans = 0;
                if(s.equals("+"))
                    ans = first + second;
                else if(s.equals("*"))
                    ans = first * second;
                else if(s.equals("-"))
                    ans = first - second;
                else
                    ans = first / second;
                
                temp.push(ans);
            }
            else 
                temp.push(Integer.parseInt(tokens[x]));
        }
        return (int)temp.pop();
    }
}