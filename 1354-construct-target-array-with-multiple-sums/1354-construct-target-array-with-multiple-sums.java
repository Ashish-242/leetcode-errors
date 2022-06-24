// class Solution {
//     public boolean isPossible(int[] target) {
//         long sum=0;
//         int max=0;
        
//         for(int i=0;i<target.length;i++){
//             sum+=target[i];
//             if(target[i]>target[max]) max=i;
//         }
//         long diff=sum-target[max];
//         if(target[max]==1 || diff==1) return true;
// //         [1,1000] diff==1
// //         [1,1,1,1,1] max==1
// //         [1,2,1] =diff==0
// //         [1,2,2] diff>target[max];
// //         target[max]%diff==0  [20,5]
//         if(diff==0 || diff> target[max] || target[max]%diff==0 ) return false;
        
//         target[max]%=diff;
//         return isPossible(target);
//     }
// }

// Another Approach
class Solution {
    public boolean isPossible(int[] target) {
        long sum=0;
    
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=0;i<target.length;i++){
            sum+=target[i];
           pq.add(target[i]);
        }
        while(pq.peek()!=1){
            int val=pq.poll();
            long diff=sum-val;
        if( diff==1) return true;
//         [1,1000] diff==1
//         [1,1,1,1,1] max==1
//         [1,2,1] =diff==0
//         [1,2,2] diff>target[max];
//         target[max]%diff==0  [20,5]
        if(diff==0 || diff> val || val%diff==0 ) return false;
        sum=
       val%=diff;
            sum=val+diff;
            pq.add(val);
        }
      
        return true;
    }
}