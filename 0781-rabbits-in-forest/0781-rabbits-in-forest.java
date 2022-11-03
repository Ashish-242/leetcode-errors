class Solution {
    public int numRabbits(int[] arr) {
          int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           
        }
        
        for(int key:map.keySet()){
            int gs=key+1;
            int noofrabbits=map.get(key);
            int group=(int)Math.ceil(noofrabbits*1.0 / gs*1.0);
            count+=group*gs;
        }
        return count;
    }
}