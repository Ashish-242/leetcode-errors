class Solution {
    public int countKDifference(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map=new HashMap<>();
        int ans=0;
        for(int it:nums){
            int val=it-k;
            if(val>0 && map.containsKey(val)){
                ans+=map.get(val);
            }
                map.put(it,map.getOrDefault(it,0)+1);
            
        }
        return ans;
    }
}