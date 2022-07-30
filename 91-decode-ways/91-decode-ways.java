class Solution {
    public int numDecodings(String s) {
     int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
      int ans=solve(s,0,dp);
        return ans;
    }
    public int solve(String s,int index,int[] dp){
        if(index==s.length()) {
            return dp[index]=1;
        }
        if(s.charAt(index)=='0') return 0;
        if(dp[index]!=-1) return dp[index];
    
        int take1=solve(s,index+1,dp);
        int take2=0;
        if(index<s.length()-1){
        String ch2=s.substring(index,index+2);
        int x=Integer.parseInt(ch2);
        if(x<=26){
            take2=solve(s,index+2,dp);
        }
    }
        return dp[index]=take1+take2;
    }
}