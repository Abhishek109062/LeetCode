class MinStack {
    Stack<Integer> stac;
    int min;
    public MinStack() {
         stac = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if( val <= min){
            stac.push(min);
            min=val;
        }  
        stac.push(val);
    }
    
    public void pop() {
        if(stac.pop() == min)
            min = stac.pop();
    }
    
    public int top() {
        return stac.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */