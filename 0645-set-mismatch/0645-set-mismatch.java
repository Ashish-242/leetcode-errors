class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
    int dup=0;
        int miss=0;
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])!=-1){
                dup=nums[i];
                
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                miss=i;
                break;
            }
        }
        return new int[]{dup,miss};
    }
}