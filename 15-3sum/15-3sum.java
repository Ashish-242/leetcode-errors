class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int i=0;
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        while(i<n-2){
            int j=i+1; 
            int k=n-1;
            
            while(j<k){
                List<Integer> r=new ArrayList<>();
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    r.add(nums[i]);
                    r.add(nums[j]);
                    r.add(nums[k]);
                    if(!set.contains(r)) {
                        res.add(r);
                        set.add(r);
                    } 
                  
                }
                 if(sum>0) k--;
                else j++;
                
            }
            i++;
        }
        return res;
    }
}