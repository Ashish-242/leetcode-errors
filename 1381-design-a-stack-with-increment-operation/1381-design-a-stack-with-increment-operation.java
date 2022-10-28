class CustomStack {
   ArrayList<Integer> res;
    int max;
    public CustomStack(int maxSize) {
       res=new ArrayList<>();
        max=maxSize;
    }
    
    public void push(int x) {
        if(res.size()==max) {
            return;
        }
        res.add(x);
    }
    
    public int pop() {
        return res.size()>0? res.remove(res.size()-1) : -1;
    }
    
    public void increment(int k, int val) {
        int x=0;
        while(x<k && x<res.size()){
            res.set(x,res.get(x)+val);
            x++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */