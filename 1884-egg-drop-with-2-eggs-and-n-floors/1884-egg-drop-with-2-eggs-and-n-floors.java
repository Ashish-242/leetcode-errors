class Solution {
    public int twoEggDrop(int n) {
         int[][] dp=new int[3][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int ans=solve( 2, n,dp);
        return ans;
    } 
    public int solve(int e,int n,int[][] dp){
        
    
         if( n==2|| n==1) return n;
        if(e==1 ) return n;
        if(dp[e][n]!=-1) return dp[e][n];
        int mn=Integer.MAX_VALUE;
        int l=1;
        int h=n;int temp=0;
//         
          while(l<=h){
              int mid=(l+h)/2;
              
              int left=solve(e-1,mid-1,dp);
              int right=solve(e,n-mid,dp);
               temp=1+Math.max(left,right);
              if(left<right){
                  l=mid+1;
                  
              }else{
                  h=mid-1;
              }
              mn=Math.min(mn,temp);
                        //store minimum attempts
        }
        return dp[e][n]=mn;
    
    }
   
}