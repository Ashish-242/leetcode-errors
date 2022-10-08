class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int i=0;
        int n=nums.length;
        
        while(i<n-2){
            int j=i+1; 
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                set.add(Arrays.asList(nums[i],nums[j++],nums[k--])); 
                }
                 if(sum>0) k--;
                else if(sum<0) j++;
                
            }
            i++;
        }
        return new ArrayList<>(set);
    }
}