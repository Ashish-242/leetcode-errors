class Solution {
    public int countSquares(int[][] arr) {
//         the idea is to see that for a matrix 1st row and 1st column will be the same in dp matrix because they represent itself like arr[0][3] agar 1 hai to wo khud mei ek square h 
//         now ab jitne bhi cells  h unme agar 1 h to wo khud ko to represent krte hi h or sath sath ho skta h wo 2side square bhi bna le ya 3side square to wo index ab dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])); minimum nikalenge usse upar ka cell lekar usse left ka cell lekar or usse diagonally upar ka cell lekar or +1 kr denge to agr minmum 0 aaya to wo single square h 1 aaya to 2side square h or 2 aaya to 3side square h 
        int n=arr.length;
        int m=arr[0].length;
       int[][] dp=new int[n][m];
           for(int i=0;i<m;i++){
               dp[0][i]=arr[0][i];
           }
        for(int j=0;j<n;j++){
            dp[j][0]=arr[j][0];
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(arr[i][j]==0) dp[i][j]=0;
                else{
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
               
            }
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=dp[i][j];
            }
        }
        return sum;
        
    }
}