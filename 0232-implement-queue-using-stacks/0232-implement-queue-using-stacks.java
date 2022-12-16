class MyQueue {
    Stack<Integer> stk1, stk2;
    public MyQueue() {
        stk1 = new Stack<>();
        stk2 = new Stack<>();
    }
    
    public void push(int x) {
        stk2.push(x);
    }
    
    public int pop() {
        if(stk1.isEmpty()){
            while(!stk2.isEmpty())
                stk1.push(stk2.pop());
        }
        return stk1.pop();
    }
    
    public int peek() {
        if(stk1.isEmpty()){
            while(!stk2.isEmpty())
                stk1.push(stk2.pop());
        }
        return stk1.peek();
    }
    
    public boolean empty() {
        if(stk1.isEmpty() && stk2.isEmpty()) return true;
        return false;
    }
}