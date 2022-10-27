class StockSpanner {
    Stack<Integer> st;
    HashMap<Integer,Integer> arr;

    public StockSpanner() {
        st=new Stack<>();
        arr=new HashMap<>();
    }
    
    public int next(int price) {
        if(st.isEmpty()){
            st.push(price);
            arr.put(price,1);
           
            return 1;
        }
        int ans=0;
        while( !st.isEmpty() && st.peek() <= price){
            ans+=arr.get(st.peek());
            st.pop();
            
        }
        if(ans!=0){
            arr.put(price,ans+1);
            st.push(price);
            return ans+1;
        }else{
            st.push(price);
            arr.put(price,1);
        }
        
        return 1;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */