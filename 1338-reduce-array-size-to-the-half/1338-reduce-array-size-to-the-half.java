class Solution {
    
    public int minSetSize(int[] arr) {
        int mx=Integer.MIN_VALUE;
        int index=0;
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       
        for(int i=0;i<arr.length;i++){
          
            int it=arr[i];
            map.put(it,map.getOrDefault(it,0)+1);
            
            
        }
        
        for(int val:map.values()){
            
            pq.add(val);
        }
        int count=0;
        int length=0;
        while(pq.size()>0){
           int x=pq.remove();
            length+=x;
             count++;
            if(length>= n/2){
               
                return count;
            }
        }
        return 0;
    }
}