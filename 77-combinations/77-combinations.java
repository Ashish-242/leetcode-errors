class Solution {
    List<List<Integer>> res=new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
      
        solve(1,n,k,list);
        return res;
    }
    public void solve(int x,int n,int k,List<Integer>list){
        if(k==0){
            res.add(new ArrayList<>(list));
            return;
        }
       for(int i=x;i<=n;i++){
           list.add(i);
           solve(i+1,n,k-1,list);
           list.remove(list.size()-1);
       }
        
    }
}