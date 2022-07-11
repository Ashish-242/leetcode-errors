class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        int[] p=new int[n+1];
        int[] r=new int[n+1];
//         n+1 because our vertices are starting from 1
//         Dsu
        for(int i =0;i<p.length;i++){
            p[i]=i;
            r[i]=0;
        }
        int removals=0;
        int e1=0;
        int e2=0;
        
        for(int[] edge:edges){
            if(edge[0]==3){
//                 for both alice and bob
            int edge1=edge[1];
                int edge2=edge[2];
                boolean flag=union(edge1,edge2,p,r);
                if(flag==false){
                    removals++;
                }else{
                    e1++;
                    e2++;
                }
            }
        }
       int[]p1=p.clone();
         int[]r1=r.clone();
         for(int[] edge:edges){
            if(edge[0]==1){
//                 for alice 
            int edge1=edge[1];
                int edge2=edge[2];
                boolean flag=union(edge1,edge2,p1,r1);
                if(flag==false){
                    removals++;
                }else{
                    e1++;
                    
                }
            }
        }
        int[]p2=p.clone();
        int[] r2=r.clone();
         for(int[] edge:edges){
            if(edge[0]==2){
//                 for bob
            int edge1=edge[1];
                int edge2=edge[2];
                boolean flag=union(edge1,edge2,p2,r2 );
                if(flag==false){
                    removals++;
                }else{
                   
                    e2++;
                }
            }
        }
        
        if(e1!=n-1 || e2!=n-1) return -1;
        return removals;
        
    }
    public int find(int[] p,int k){
        if(p[k]==k) return k;
        p[k]=find(p,p[k]);
        return p[k];
    }
    public boolean union(int X,int Y,int[]p,int[] r){
        int x=find(p,X);
        int y=find(p,Y);
        if(x==y) return false;
        if(r[x]>r[y]){
            p[x]=y;
        }else if(r[y]>r[x]){
            p[y]=x;
        }else{
            p[x]=y;
            r[x]++;
        }
        return true;
    }
}