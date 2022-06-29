class Solution {
    public int[] sortArray(int[] nums) {
       PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int it:nums){
            pq.add(it);
        }
        int[] arr=new int[nums.length];
        int i=0;
        while(pq.size()>0){
            arr[i]=pq.poll();
            i++;
            
        }
        return arr;
    }
}