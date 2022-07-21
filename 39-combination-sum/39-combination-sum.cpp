class Solution {
public:
     vector<vector<int>> mres;
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
       
        combination(candidates,0,target);
        return mres;
    }
    vector<int> res;
    
    void combination(vector<int>& candidates, int idx,int target)
    {
        if(target<0) return;
        if(idx==candidates.size()){
            if(target==0){
                mres.push_back(res);
                return;
            } 
            return;
        }
     
        res.push_back(candidates[idx]);
       
        combination(candidates,idx,target-candidates[idx]);
         res.pop_back();
        combination(candidates,idx+1,target);
     
       
        
    }
};