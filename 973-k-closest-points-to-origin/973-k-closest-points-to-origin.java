class Solution {
    // private int dis(int[] as){
    //     return as[0]*as[0] + as[1]*as[1];
    // }
//     public class Pair implements Comparator<Pair>{
//         int x;
//         int[] ar;
//         Pair(){
            
//         }
//         Pair(int x,int[] ar){
//             this.x=x;
//             this.ar=ar;
//         } 
//         public int compare(Pair a,Pair b){
//             return b.x-a.x;
//         }
//     }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>(){
            public int compare(int[]p1 ,int[] p2){
                return (p2[0]*p2[0]+p2[1]*p2[1]) - (p1[0]*p1[0]+p1[1]*p1[1]);
            }
        });
        // PriorityQueue<Pair> pq=new PriorityQueue<>(new Pair());

        for(int[] as:points){
            // int x=as[0]*as[0] + as[1]*as[1];
            // Pair rem=new Pair(x,as);
            // pq.add(rem
            pq.add(as);
            if(pq.size()>k) pq.poll();
        }
      int[][] res=new int[k][2];
        int i=0;
       while(pq.size()>0){
          // Pair r=pq.remove();
           res[i]=pq.remove();
           i++;
       }
     return res;
    }
}