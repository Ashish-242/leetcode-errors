class Solution {
    class Pair {
        int val;
        int key;
        Pair(int val,int key){
            this.val=val;
            this.key=key;
        }
     
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq=new PriorityQueue<>(new Comparator<Pair>(){
               public int compare(Pair a,Pair b){
            if(a.val==b.val) return b.key-a.key;
            return b.val-a.val;
        }
        });
        for(int i=0;i<arr.length;i++){
            Pair rem=new Pair(Math.abs(x-arr[i]),arr[i]);
            pq.add(rem);
            if(pq.size()>k){
                pq.remove();
            }
     
        }
        List<Integer> res=new ArrayList<>();
        while(pq.size()>0){
            Pair temp=pq.poll();
         
            res.add(temp.key);
        }
        Collections.sort(res);
        return res;
        
    }
}