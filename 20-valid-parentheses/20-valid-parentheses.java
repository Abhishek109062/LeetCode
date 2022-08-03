class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> obj=new ArrayDeque<>();
        for(int x=0;x<s.length();x++){
            char ch=s.charAt(x);
            if(ch=='(' || ch=='{' || ch=='[')
                obj.push(ch);
            else{
                if(obj.isEmpty())
                    return false;
                
                else if((obj.peek()=='(' && ch!=')') || (obj.peek()=='{' && ch!='}') || (obj.peek()=='[' && ch!=']'))
                    return false;
                else 
                    obj.pop();
            }
        }
        return obj.isEmpty();
    }
}