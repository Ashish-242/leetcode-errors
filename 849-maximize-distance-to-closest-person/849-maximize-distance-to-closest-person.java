class Solution {
    public int maxDistToClosest(int[] seats) {
        int i=0,j=-1;
        int n=seats.length;
        
        int res=0;
        for(i=0;i<seats.length;i++){
           
            if(seats[i]==1){
              if(j<0){
                res=Math.max(res,i);
              }else{
                  res=Math.max(res,(i-j)/2);
              }  
                j=i;
            }
        }
        if(seats[n-1]==0){
            res=Math.max(res,n-j-1);
        }
        return res;
    }
}