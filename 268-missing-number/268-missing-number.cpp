class Solution {
public:
    int missingNumber(vector<int>& nums) {
        if(nums.size()==0) return 0;
        if(nums.size()==1 && nums[0]!=1){
            return 1;
        }
        unordered_map<int,int> mp;
        for(int val : nums){
            mp[val]++;
            
        }
        for(int i=0;i<=nums.size();i++){
            if(mp.find(i)==mp.end()){
                return i;
            }
        }
        return 0;
    }
};