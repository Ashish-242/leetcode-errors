class Solution {
    public int numSimilarGroups(String[] str) {
        HashSet<String> visited=new HashSet<>();
        int ans=0;
        for(String s:str){
            if(!visited.contains(s)){
                dfs(s,str,visited);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(String s,String[] str,  HashSet<String> visited){
        if(visited.contains(s)) return;
        visited.add(s);
        for(int i=0;i<str.length;i++){
            if(issimiliar(s,str[i])){
                dfs(str[i],str,visited);
            }
        }
    }
    public boolean issimiliar(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
            if(count>2) return false;
        }
        return count<2 || count==2;
    }
}