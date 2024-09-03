class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int it :nums){
            pq.add(it);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.peek();
    }
}