class MinStack {
    int val;
    Deque<Integer> st;

    public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int val) {
        st.addFirst(val);
    }
    
    public void pop() {
        if(!st.isEmpty())
        st.removeFirst();
    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peekFirst();

        return -1;

    }
    
    public int getMin() {
    int min = Integer.MAX_VALUE;

    for(int x : st) {
        min = Math.min(min, x);
    }

    return min;
    }
}
