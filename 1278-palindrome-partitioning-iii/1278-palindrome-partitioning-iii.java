class Solution {
    public int[][] minchanges(String s){
//         how much change required for substring to become palindrome
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int gap=1;gap<n;gap++){
            for(int i=0,j=gap;j<n;j++,i++){
                if(gap==1){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=0;
                    else dp[i][j]=1;
                }else{
                    dp[i][j]=s.charAt(i)==s.charAt(j)?dp[i+1][j-1]:dp[i+1][j-1]+1;
                }
            }
        }
        return dp;
        
    }
    public int solve(String s,int k ,int si,int[][] minchanges,int[][] dp){
        if(s.length()-si<= k){
            return dp[si][k]=s.length()-si==k?0:(int)1e9;
        }
        if(k==1) return dp[si][k]=minchanges[si][s.length()-1];
        
        if(dp[si][k]!=-1) return dp[si][k];
        
        int minans=(int)1e9;
        
        for(int cut=si;cut<s.length();cut++){
            int change=minchanges[si][cut];
            int restchange=solve(s,k-1,cut+1,minchanges,dp);
            if(restchange!=(int)1e9)
            minans=Math.min(minans,change+restchange);
            
        }
        return dp[si][k]=minans;
    }
    public int palindromePartition(String s, int k) {
        int n=s.length();
        int[][] minchanges=minchanges(s);
        int[][] dp=new int[n+1][k+1];
        for(int[] d:dp){
            Arrays.fill(d,-1);
        }
        int ans=solve(s,k,0,minchanges,dp);
        return ans;
    }
}