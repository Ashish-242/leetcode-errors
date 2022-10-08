class Solution {
    public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
// 	int closest = 0;

// 	for (int i = 0, n = nums.length, minDiff = Integer.MAX_VALUE; i < n - 2; i++)
// 		for (int j = i + 1, k = n - 1; j < k;) {
// 			int sum = nums[i] + nums[j] + nums[k];
// 			if (sum == target)
// 				return target;
// 			if (sum < target)
// 				j++;
// 			else
// 				k--;

// 			int diff = Math.abs(target - sum);
// 			if (diff < minDiff) {
// 				minDiff = diff;
// 				closest = sum;
// 			}
// 		}
	// return closest;
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        
        int sum=0;
        int ans=0;
     int minsum=Integer.MAX_VALUE;
     while(i<n-2){
         int j=i+1;
         int k=n-1;
            
         while(j<k){
             sum=nums[i]+nums[j]+nums[k];
             
             int tsum=Math.abs(target-sum);
             if(minsum>tsum){
                 ans=sum;
                 minsum=tsum;
             } 
             if (sum == target)
				return target;
			else if (sum < target)
				j++;
			else
				k--;
              
             
         }
         i++;
         
         
     }
        return ans;
        
    }
}