class Solution {
public:
    int maxRotateFunction(vector<int>& nums) {
         int sum=0, n=nums.size(),sumf=0, maxf=INT_MIN;
        for(int i =0;i<n;i++){
            sum+=nums[i];
            sumf+=i*nums[i];
        }
       maxf=sumf;
        for(int i=0;i<n;i++){
            sumf=sumf-sum +n*nums[i];
        maxf=max(maxf,sumf);
        }
        return maxf;
    }
};