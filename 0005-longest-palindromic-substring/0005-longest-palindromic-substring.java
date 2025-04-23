class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        //like if dp[1][3] then there is differnece of 2 between these two index1,2 so 
        //gap here is 2 
        int length=0;
        int index=0;
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){
                if(gap==0) dp[i][j]=1;
                else if(gap==1 && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=2;
                }else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0 ){
                    dp[i][j]=dp[i+1][j-1] +2;
                }else{
                    dp[i][j]=0;
                }

                if(dp[i][j] >length){
                    length=dp[i][j];
                    index=i;
                }
            }
        }
        return s.substring(index,index+length);
    }
}