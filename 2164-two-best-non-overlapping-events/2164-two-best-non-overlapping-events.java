class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        //here priorityqueue used to sort all events according to end value and to calculate
        //all events maximum value that ends before the next start time of event
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int maxvalue=0;int ans=0;
        for(int[] event:events){
            int start=event[0], end=event[1], value=event[2];
            while(!pq.isEmpty() && pq.peek()[0]<start){
                maxvalue=Math.max(maxvalue,pq.poll()[1]);
            }
            ans=Math.max(ans,maxvalue+value);
            pq.add(new int[]{end,value});
        }
        return ans;

    }
}