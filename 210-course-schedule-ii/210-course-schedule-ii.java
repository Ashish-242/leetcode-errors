class Solution {
    public int[] findOrder(int V, int[][] pre) {
        int[] in=new int[V];
        
         for(int[] a:pre){
             in[a[1]]++;
         }
         
    
        ArrayDeque<Integer> q=new ArrayDeque<>();
        
        for(int i=0;i<V;i++){
            if(in[i]==0) q.add(i);
        }
        int[] ans=new int[V];
        int idx=V-1;
        while(q.size()>0){
            int y=q.remove();
            ans[idx]=y;
            idx--;
            for(int[] a:pre){
                if(a[0]==y){
                    in[a[1]]--;
                    if(in[a[1]]==0){
                        q.add(a[1]);
                    }
                }
            }
        }
        if(idx>=0) return new int[0];
        return ans;
    }
}