class Solution {
public:
    int maxRotateFunction(vector<int>& nums) {
         int sum=0, n=nums.size(),sumf=0, max=INT_MIN;
        for(int i =0;i<n;i++){
            sum+=nums[i];
            sumf+=i*nums[i];
        }
        if(max<sumf) max=sumf;
        for(int i=0;i<n;i++){
            sumf=sumf-sum +n*nums[i];
            if(sumf>max) max=sumf;
        }
        return max;
    }
};