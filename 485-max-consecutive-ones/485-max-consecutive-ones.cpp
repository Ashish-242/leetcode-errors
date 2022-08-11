class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int ans=0;
        int  k=0;
        
        for(int i=0;i<nums.size();i++){
            if(nums[i]==1){
                k++;
            }else{
                ans=max(ans,k);
                k=0;
            }
        }
        ans=max(ans,k);
        return ans;
    }
};