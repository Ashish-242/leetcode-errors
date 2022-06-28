class Solution {
    class Pair {
        int key;
        int val;
        Pair(int key,int val){
            this.val=val;
            this.key=key;
        }
        // public int compare(Pair o){
        //     if(this.key-o.key==0){
        //         return o.val-this.val;
        //     }
        //     return o.key-this.key;
        // }
    }
    // PriorityQueue<Pair> pq = new PriorityQueue<>(
    //     new Comparator<Pair>(){
    //         public int compare(Pair a, Pair b){
    //             // if both the keys are same then compare on the bases of their values
    //             if((b.key - a.key) == 0)
    //                 return b.value - a.value;
    //             return b.key - a.key;
    //         }
    // });
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(
        new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                // if both the keys are same then compare on the bases of their values
                if((b.key - a.key) == 0)
                    return b.val - a.val;
                return b.key - a.key;
            }
    });
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            Pair rem=new Pair(Math.abs(arr[i]-x),arr[i]);
            pq.add(rem);
            if(pq.size()> k){
                pq.remove();
            }
        }
   while(pq.size()>0){
       Pair rem=pq.poll();
       res.add(rem.val);
   }
        Collections.sort(res);
        return res;
      
        
    }
    
}