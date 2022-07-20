class Solution {
    public List<Integer> majorityElement(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
         ArrayList<Integer> list=new ArrayList<>();
        for(int val : arr){
            map.put(val,map.getOrDefault(val,0)+1);
           
        }
        for(int val:map.keySet()){
             if(map.get(val)> n/3){
                 list.add(val);
                
                
            }
        }
        Collections.sort(list);
        return list;

    }
}