class Solution {
    public int maxOperations(int[] nums, int k) {
        int h=0,a=nums.length-1;
        Arrays.sort(nums);
        int count=0;
        while(a>h){
            int sum=nums[h]+nums[a];
            if(sum==k){
                count++;
                h++;
                a--;
            }else if(sum<k){
                h++;
            }else{
                a--;
            }
        }
        return count;
    }
}