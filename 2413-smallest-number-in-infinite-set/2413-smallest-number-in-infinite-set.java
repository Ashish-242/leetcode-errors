class SmallestInfiniteSet {
PriorityQueue<Integer> pq;
HashSet<Integer> set;
int n;
    public SmallestInfiniteSet() {
        pq=new PriorityQueue<>();
        set=new HashSet<>();
        n=1;
    }
    
    public int popSmallest() {
        if(!pq.isEmpty()){
            set.remove(pq.peek());
         return pq.poll();
        }else return n++;
    }
    
    public void addBack(int num) {
        if(num<n){
            if(!set.contains(num)){
                   set.add(num);
             pq.add(num);
            }
         
        }
       
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */