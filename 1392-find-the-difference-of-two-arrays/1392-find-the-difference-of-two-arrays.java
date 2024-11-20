class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<Integer> map=new HashSet<>();
        HashSet<Integer> all=new HashSet<>();

        for(int it : nums2){
            map.add(it);
        } 
        List<Integer> arr=new ArrayList<>();
        for(int it:nums1){
           
            if(!map.contains(it) && !all.contains(it)){
                all.add(it);
                arr.add(it);
            }
        }
        ans.add(new ArrayList<>(arr));
        arr.clear();
        map.clear();
        all.clear();

             for(int it : nums1){
            map.add(it);
        } 
        for(int it:nums2){
            if(!map.contains(it) && !all.contains(it)){
                    all.add(it);
                    arr.add(it);
            }
                
        }
      ans.add(new ArrayList<>(arr));
        return ans;
    }
}