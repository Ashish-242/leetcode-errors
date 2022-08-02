class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
      int pmin=intervals[0][0];
        int pmax=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
              
          if(intervals[i][0]> pmax){
             list.add(new ArrayList<>(Arrays.asList(pmin,pmax)));
              pmin=intervals[i][0];
              pmax=intervals[i][1];
          }else
              pmax=Math.max(pmax,intervals[i][1]);
        }
        list.add(new ArrayList<>(Arrays.asList(pmin,pmax)));
      
        
        int[][] res=new int[list.size()][2];
        int i=0;
       for(ArrayList<Integer> anslist:list){
           res[i][0]=anslist.get(0);
           res[i][1]=anslist.get(1);
           i++;
       }
        return res;
    }
}