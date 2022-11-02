class FindSumPairs {
int[] n1;
    int[] n2;
    HashMap<Integer,Integer> map;
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1=nums1;
        n2=nums2;
        map=new HashMap<>();
        for(int i=0;i<n2.length;i++){
            map.put(n2[i],map.getOrDefault(n2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
       if(map.get(n2[index]) ==1) map.remove(n2[index]);
        else{
            map.put(n2[index],map.get(n2[index])-1);
        }
        n2[index]+=val;
        map.put(n2[index],map.getOrDefault(n2[index],0)+1);
       
    }
    
    public int count(int tot) {
        int count=0;
        for(int i=0;i<n1.length;i++){
            int x=tot-n1[i];
            if(map.containsKey(x)){
                count+=map.get(x);
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */