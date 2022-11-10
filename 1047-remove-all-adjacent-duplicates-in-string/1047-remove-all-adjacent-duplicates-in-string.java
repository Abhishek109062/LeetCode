class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> temp = new Stack<>();
        
        // temp.push(s.charAt(0));
        for(int x = 0; x < s.length(); x++){
           if(temp.isEmpty() || temp.peek() != s.charAt(x))
               temp.push(s.charAt(x));
            else
                temp.pop();
        }
        s = "";
        for(char ch : temp)
            s += ch;
        
        return s;
    }
}