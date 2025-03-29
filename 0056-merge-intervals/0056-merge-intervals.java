class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        if(intervals.length==1) return intervals;
        Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
        int start=intervals[0][0],end=intervals[0][1];
        int i=1;
        while(i<intervals.length){
            if(intervals[i][0] <=end ){
                end=Math.max(end,intervals[i][1]);
            }else{
                ArrayList<Integer> lis=new ArrayList<>();
                lis.add(start);
                lis.add(end);
                list.add(new ArrayList<>(lis));
                
                start=intervals[i][0];
                end=intervals[i][1];
            }
            i++;
        }
          ArrayList<Integer> lis=new ArrayList<>();
                lis.add(start);
                lis.add(end);
                list.add(new ArrayList<>(lis));
                int[][] ans=new int[list.size()][2];
                int j=0;
                for(ArrayList<Integer> l:list){
                    ans[j][0]=l.get(0);
                    ans[j][1]=l.get(1);
                    j++;
                }

                return ans;
    }
}