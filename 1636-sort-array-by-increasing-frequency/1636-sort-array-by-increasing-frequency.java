class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]==b[1] ? b[0]-a[0] : a[1]-b[1]);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int it:nums){
            map.put(it,map.getOrDefault(it,0)+1);
        }
        for(HashMap.Entry<Integer,Integer> it: map.entrySet()){
            pq.add(new int[]{it.getKey(),it.getValue()});
        }
        int i=0;
        int[] arr=new int[nums.length];
        while(pq.size()>0){
            int[] ar=pq.poll();
            while(ar[1]>0){
                arr[i++]=ar[0];
                ar[1]-=1;
            }
        }
        return arr;
    }
}