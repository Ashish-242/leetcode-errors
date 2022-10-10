class Solution {
//     Memoization approach dp 
    public int steps(int[] dp,int n){
        if(n<=1 && n>=0) return 1 ;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=steps(dp,n-1)+steps(dp,n-2);
    }
//     Tabulation Approach
//       public int steps2(int[] dp,int n){
//       for(int i=0;i<n;i++){
//             if(n<=1) {
//                 dp[n]= 1;
//                 continue;
//             }
       
//        dp[n]=steps(dp,n-1)+steps(dp,n-2);
//       }
//           return dp[n];
        
//     }
// //     optimizing 
//     public int optimize(int n){
//         int a=0,b=1;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum=a+b;
//             a=b;
//             b=sum;
//         }
//         return sum;
//     }
    
    public int climbStairs(int n) {
      
    int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return steps(dp,n);
        
    }
}