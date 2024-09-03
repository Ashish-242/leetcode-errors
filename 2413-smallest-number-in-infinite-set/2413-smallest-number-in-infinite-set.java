class SmallestInfiniteSet {
PriorityQueue<Integer> pq;
int n;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        n=1;
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            if(pq.peek()<= n){
                //if(pq.peek()==n) n++;
               return pq.poll();
            }else{
                return n++;
            }
        }else return n++;
    }
    
    public void addBack(int num) {
        if(num<n)
        pq.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */