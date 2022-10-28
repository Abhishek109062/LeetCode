class Solution {
    public int calculate(String s) {
        Stack<Integer> temp = new Stack<>();
        char sign = '+';
        int num = 0;
        
        for(int x = 0; x < s.length(); x++){
            char ch = s.charAt(x);
            if(ch >= '0' && ch <= '9')
                num = num * 10 + (ch - '0');
            
            if(ch < '0' && ch != ' ' || x == s.length() - 1){
                if(sign == '+')
                    temp.push(num);
                else if(sign == '-')
                    temp.push(-1*num);
                else if(sign == '*')
                    temp.push(temp.pop() * num);
                else
                    temp.push(temp.pop() / num);
                
                sign = ch;
                num = 0;
            }
        }
        
        int ans = 0;
        for(int x : temp)
            ans += x;
        
        return ans;
    }
}