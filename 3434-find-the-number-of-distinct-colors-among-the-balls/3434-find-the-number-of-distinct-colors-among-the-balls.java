class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] ans=new int[queries.length];
        
        HashMap<Integer,Integer>map=new HashMap<>();
       HashMap<Integer,Integer>colormap=new HashMap<>();
        for(int i=0;i<queries.length;i++){
            int ball=queries[i][0];
            int color=queries[i][1];
            if(!map.isEmpty() && map.containsKey(ball)){
                int ballcolor=map.get(ball);
                if(!colormap.isEmpty() && colormap.containsKey(ballcolor) ){
                    int val=colormap.get(ballcolor);
                    if(val==1) colormap.remove(ballcolor);
                    else colormap.put(ballcolor,val-1);
                }
            }
                map.put(ball,color);
                 colormap.put(color,colormap.getOrDefault(color,0)+1);
            
           
         
            ans[i]=colormap.size();
        }
        return ans;
    }
}