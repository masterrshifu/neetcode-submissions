class MinStack {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

    public MinStack() {

        
        
    }
    
    public void push(int val) {

        if(st.isEmpty()) {
            st.push(val);
            minStack.push(val);
        } else {
            st.push(val);
            if(!minStack.isEmpty() && minStack.peek() >= val) {
                minStack.push(val);
            }
        }
        
    }
    
    public void pop() {

        if(st.isEmpty()) {
            return;
        }

        if(st.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        st.pop();
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {

        if(!minStack.isEmpty()) {
            return minStack.peek();
        }
        return -1;
        
    }
}
