class Solution {
    
    public int solve(int e,int n,int[][] dp){
        if(n==0 || n==1) return n;
        if(e==1 ) return n;
        if(dp[e][n]!=-1) return dp[e][n];
        int mn=Integer.MAX_VALUE;
        int l=1;
        int h=n;int temp=0;
//         for(int f=1;f<=n;f++){
// //             breaks
//             int breaks=solve(e-1,f-1,dp);
// //             not break
//             int notbreak=solve(e,n-f,dp);
//             // we are doing max for obtaining worst cse scenerion
//             int max1=1+Math.max(breaks,notbreak);
//            mn=  Math.min(mn,max1);
//         }
          while(l<=h)
        {
            int mid=(l+h)/2;
            int left=solve(e-1,mid-1,dp);   //egg broken check for down floors of mid
            int right=solve(e,n-mid,dp) ;   // not broken check for up floors of mid
            temp=1+Math.max(left,right);          //store max of both 
            if(left<right){                  //since right is more than left and we need more in worst case 
              l=mid+1;                       // so l=mid+1 to gain more temp for worst case : upward
            }
            else                             //left > right so we will go downward 
            {    
                h=mid-1;
            }
            mn=Math.min(mn,temp);               //store minimum attempts
        }
        return dp[e][n]=mn;
    
    }
    
    public int superEggDrop(int k, int n) {
        int[][] dp=new int[k+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int ans=solve( k, n,dp);
        return ans;
    }
}