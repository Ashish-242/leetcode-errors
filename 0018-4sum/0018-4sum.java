class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j-1]==nums[j]){
                    continue;
                }
               
                int k=j+1;
                int h=n-1;
                long val=nums[i]+nums[j];
                    long rval=(long)target-val;
                while(k<h){
                    
                if(nums[k]+nums[h]==rval){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[h]);
                        res.add(list);
                        while(k<h && nums[k]==nums[k+1]){
                            k++;
                        }
                        while(k<h && nums[h]==nums[h-1]){
                            h--;
                        }
                        k++;
                        h--;
                    }
                    else if(nums[k]+nums[h] > rval){
                        h--;
                    }else{
                        k++;
                    }
            
                    
                }
                
            }
        }
        return res;
    }
}