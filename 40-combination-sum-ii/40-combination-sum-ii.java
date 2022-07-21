class Solution {
      
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
           List<List<Integer>> mres = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        Arrays.sort(candidates);
        combination(candidates,0,target,res,mres);
        
        return mres;
    }
 
   public void combination(int[] candidates, int idx,int target,List<Integer> res,List<List<Integer>> mres)
    {
        if(target<0)
        {
            return;
        }
       if(idx==candidates.length){
           if(target==0){
               mres.add(new ArrayList<>(res));
               return;
           }
           return;
       }
        
       
//        pick
       res.add(candidates[idx]);
       combination(candidates,idx+1,target-candidates[idx],res,mres);
       res.remove(res.size()-1);
//        not pick
       while(idx<candidates.length-1 && candidates[idx]==candidates[idx+1]){
           idx++;
       }
        combination(candidates,idx+1,target,res,mres);
       
     
       
        
    }
}