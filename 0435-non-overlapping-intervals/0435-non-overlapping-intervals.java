class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> a[1]-b[1]);
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>((a,b)->b[0]-a[0]);
        pq.add(new int[]{intervals[0][0],intervals[0][1] });
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0],end=intervals[i][1];
            while(pq.peek()[1] <= start ){
                pq.add(new int[]{start,end});
            }
        }
        return intervals.length-pq.size();
    }
}