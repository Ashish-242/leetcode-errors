class Solution {
    public void solve(int open,int close,List<String> res,String p,int x){
        if(open==0 && close==0){
            if(x==0) res.add(p);
            
            return;
        }
        if(open>0){
           if(x>=0) {
               solve(open-1,close,res,p+"(",x+1);
           }
            
        }
        if(close>0){
           if(x>0){
               solve(open,close-1,res,p+")",x-1);
           }
            
        }
        
    }
    public List<String> generateParenthesis(int n) {
        Stack<Integer> st=new Stack<>();
        List<String> res=new ArrayList<>();
        solve(n,n,res,"",0);
        return res;
    }
}