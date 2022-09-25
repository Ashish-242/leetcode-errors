class MyCircularQueue {
    Deque<Integer> q;
     int x=0;
    public MyCircularQueue(int k) {
        q=new ArrayDeque<>(k);
       
        x=k;
    }
   
    public boolean enQueue(int value) {
       if(x>0){
            q.addLast(value);
             x--;
           return true;
       }
        return false;
      
    }
    
    public boolean deQueue() {
         if(q.size()==0) {
             return false;
         }
             
        else {
            q.poll();
            x++;
            return true;
        }
    }
    
    public int Front() {
     if(q.size()==0) return -1;
        return q.peek();
    }
    
    public int Rear() {
         if(q.size()==0) return -1;
        return q.getLast();
    }
    
    public boolean isEmpty() {
        if(q.size()==0) return true;
        return false;
    }
    
    public boolean isFull() {
        if(x==0) return true;
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */