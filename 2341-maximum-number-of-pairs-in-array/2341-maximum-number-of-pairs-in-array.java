class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
      
        int countpairs=0;
        
        for(int it:nums){
            if(!map.containsKey(it)){
               map.put(it,1);
            }else{
                countpairs++;
                map.remove(it);
            }
        }
     return new int[]{countpairs,map.size()};
}
}