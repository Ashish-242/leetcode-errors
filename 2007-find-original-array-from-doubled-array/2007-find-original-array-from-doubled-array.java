class Solution {
    public int[] findOriginalArray(int[] changed) {
       HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(changed);
        int n=changed.length;
        if(n==1 || n%2!=0) return  new int[]{};
        for(int i=0;i<n;i++){
            map.put(changed[i],map.getOrDefault(changed[i],0)+1);
        }
        
        
        int[] arr=new int[n/2];
        int i=0;
        for(int j=0;j<n;j++){
            int k=changed[j];
           int s=2*k;
            if(map.containsKey(k) && map.containsKey(s) && map.get(k)>0 && map.get(s)>0){
               
                arr[i]=k;
                i++;
             map.put(k,map.get(k)-1);
              map.put(s,map.get(s)-1);
                  
             
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)!=0) return new int[]{};
        }
            
        return arr;
    }
}