class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int it:nums){
            map.put(it,map.getOrDefault(it,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int key:map.keySet()){
            pq.add(key);
            if(pq.size()>k ) pq.poll();
        }
        int[] arr=new int[k];
        int i=0;
        while(pq.size()>0){
            arr[i]=pq.poll();
            i++;
        }
        return arr;
    }
}