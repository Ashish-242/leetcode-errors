class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        for(int[] r:points){
            System.out.println(r[0]+ " " + r[1]);
        }
        long endpos=points[0][1];
        int arrow=1;
        for(int i=1;i<points.length;i++){
            long start=points[i][0],end=points[i][1];
            if(endpos<start){
                arrow++;
                endpos=end;
            }else{
                endpos=Math.min(endpos,end);
                
            }
        }
        return arrow;
    }
}