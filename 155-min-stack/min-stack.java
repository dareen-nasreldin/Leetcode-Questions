class MinStack {
        Deque<Integer> main = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
    public MinStack() {

    }
    
    public void push(int val) {
        main.push(val);
        if(!min.isEmpty())
        {
            if(min.peek() >= val)
                min.push(val);
        }
        else{
            min.push(val);
        }
    }
    
    public void pop() {
        if(main.pop().equals(min.peek()))
        {
            min.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return min.peek();
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