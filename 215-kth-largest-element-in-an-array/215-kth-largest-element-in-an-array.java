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
// c++
// c++ mei add ki jagah push hota h java mei add hota  h
// c++ mei top hota h or java mei peek hota  h
// c++ mei pop hota h or java mei remove hota h 


    // int i=0;
    // int findKthLargest(vector<int>& nums, int k) {
    //     priority_queue<int,vector<int>,greater<int>> pq;
    //     while(i!=k)
    //     {
    //         pq.push(nums[i]);
    //         i++;
    //     }
    //     for(int i=k;i<nums.size();i++)
    //     {
    //         if(nums[i] > pq.top())
    //         {
    //             pq.pop();
    //             pq.push(nums[i]);
    //         }
    //     }
    //    return pq.top();
        
  