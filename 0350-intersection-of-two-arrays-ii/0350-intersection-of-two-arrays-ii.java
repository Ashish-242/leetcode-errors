class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int it:nums2)   map.put(it,map.getOrDefault(it,0)+1);
      
        ArrayList<Integer> list=new ArrayList<>();
       
        for(int it:nums1){
            if(map.containsKey(it)){
                list.add(it);
                if(map.get(it)>1) map.put(it,map.get(it)-1);
                else map.remove(it);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<res.length;i++){
            res[i]=list.get(i);
        }
        return res;
    }
}