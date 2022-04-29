class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int i=0;
        int ans=INT_MAX;
        int j = 0;
       
        while(j<nums.size()){
            if(j-i+ 1 == k){
                ans = min(nums[j]-nums[i],ans);
                i++;
            }
          
             
                j++;
               
            
        
          
        }
        return ans == INT_MAX?0:ans;
    }
};