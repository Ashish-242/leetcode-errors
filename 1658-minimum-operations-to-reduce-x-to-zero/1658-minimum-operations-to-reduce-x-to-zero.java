class Solution {
    public int minOperations(int[] nums, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ii=0;
         int tsum=0;
        int sum=0;
        int ans=-1;
        map.put(0,-1);
        for(int k:nums){
            tsum+=k;
            map.put(k,ii);
            ii++;
        }
        if(tsum==x) return nums.length;
       int xx=tsum-x;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           if(map.containsKey(sum-xx)){
               ans=Math.max(ans,i-map.get(sum-xx));
               
           }
            map.put(sum,i);
            
            
           
        }
        if(ans==-1) return -1;
        
        return nums.length-ans;
    }
}