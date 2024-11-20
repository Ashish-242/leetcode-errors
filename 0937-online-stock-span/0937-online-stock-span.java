class StockSpanner {
    Stack<Integer> st;
    Stack<Integer>small;
    public StockSpanner() {
        st=new Stack<Integer>();
        small=new Stack<Integer>();
    }
    
    public int next(int price) {
        if(st.isEmpty()) {
            st.add(price);
            small.add(1);
            return 1;
        }
        else if(st.peek() <= price){
                int sum=1;
            while(!st.isEmpty() && st.peek()<=price){
                sum+=small.pop();
                st.pop();
            }
            small.add(sum);
            st.add(price);
            return sum;
        }else{
            st.add(price);
            small.add(1);
            
        }
        return 1;
        
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */