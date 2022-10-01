class Solution {
    public int solve(String s,int i,int[] dp){
        if(i==s.length()){
            return 1;
        }
        if(dp[i]!=-1) return dp[i];
        
        char ch=s.charAt(i);
        int take=0;
       if(ch=='0') return 0;
        take=solve(s,i+1,dp);
        int againtake=0;
       if(i<s.length()-1){
           String ss=s.substring(i,i+2);
        int range=Integer.parseInt(ss);
        if(range<=26){
            againtake=solve(s,i+2,dp); 
        } 
       }
       
        return dp[i]=take+againtake;
    }
    public int numDecodings(String s) {
        if(s.charAt(0)=='0') return 0;
        int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
        int ans=solve(s,0,dp);
        return ans;
    }
}
