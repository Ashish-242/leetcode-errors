class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>set=new HashSet<>();
        for(String word:wordDict){
            set.add(word);
        }
       Boolean[] dp=new Boolean[s.length()+1];
       
       return solve(s,0,wordDict,set,dp);
    }
    public boolean solve(String s,int start, List<String> word,HashSet<String>set,Boolean[] dp){
        if(start >= s.length()) return true;
            
            if(dp[start]!=null) return dp[start];
        for(int i=start;i<s.length();i++){
            
            String check=s.substring(start,i+1);
            if(set.contains(check)){
                if(solve(s,i+1,word,set,dp)){
                    return dp[i]=true;
                }
            }
            
        }
        return dp[start]=false;
       
    }
}