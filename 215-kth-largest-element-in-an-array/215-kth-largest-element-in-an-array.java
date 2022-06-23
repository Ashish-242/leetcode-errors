class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        while(i!=k){
            pq.add(nums[i]);
            i++;
        }
        for(int j=k;j<nums.length;j++){
            if(pq.peek()<nums[j]){
                 pq.remove();
                 pq.add(nums[j]);

            }
           
        }
        return pq.remove();
    }
}