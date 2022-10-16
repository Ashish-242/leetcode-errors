class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n=heights.length;
        if(n==1) return 0;
        int i=0;
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
//        normal approach is fine but we do not know which thing should we use first brick or ladder so in that case we are using brick first and store the max amount of bricks in priorityqueue now when our brik goes less than 0 means all our bricks are used then we do ladder-- at the place where maximum brick used and take max brick from pq and add it to bricks 
//         so through this we can use bricks again and when ladder becomes less than 0 then we can not go further so return index
       while(i<n-1){
           int diff=heights[i+1]-heights[i];
           if(diff<0) i++;
           else {
               bricks-=diff;
               pq.add(diff);
               if(bricks<0){
                  ladders--;
                   bricks=pq.poll()+bricks;
               }
               if(ladders<0) break;
               i++;
               
           }
       }
      return i;
    }
}