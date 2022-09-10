class Solution {
    public List<List<String>> partition(String s) {
        int n=s.length();
        List<String> a=new ArrayList<>();
        dfs(0,s,a);
        return res;
    }
    List<List<String>> res=new ArrayList<>();
    public boolean ispalindrome(String s,int lo,int hi){
        while(lo<hi){
            if(s.charAt(lo)!=s.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }
    public void dfs(int ind,String s,List<String> a){
        if(ind ==s.length()){
            res.add(new ArrayList<>(a));
            return;
        }
        
        for(int i=ind;i<s.length();i++){
            if(ispalindrome(s,ind,i)){
           a.add(s.substring(ind,i+1));
             
                
                dfs(i+1,s,a);
                a.remove(a.size()-1);
            }
        }
    }
}