class Solution {
    public String makeGood(String s) {
        Stack<Character> temp = new Stack<>();
        for(int x = 0; x < s.length(); x++){
            if(!temp.isEmpty() && Math.abs(temp.peek() - s.charAt(x)) == 32)
                temp.pop();
            else
                temp.push(s.charAt(x));
        }
        
        s = "";
        while(!temp.isEmpty()){
            s = temp.pop() + s;
        }
        return s;
    }
}