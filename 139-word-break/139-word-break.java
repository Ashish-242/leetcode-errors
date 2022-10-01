class Solution {
    public int solve(String s,int i,Set<String> set,int[]dp){
        if(i==s.length()) return 1;
        if(dp[i]!=-1) return dp[i];
        String temp="";
        for(int j=i;j<s.length();j++){
            temp+=s.charAt(j);
            if(set.contains(temp)){
              if(solve(s,j+1,set,dp)==1) {
                   return dp[i]=1;
                  
            }
        }
        
    }
        return dp[i]=0;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>();
        for(String ss:wordDict){
            set.add(ss);
        }
        int[] dp=new int[301];
        Arrays.fill(dp,-1);
        int ans=solve(s,0,set,dp);
       if(ans==1) return true;
        return false;
        
    }
}