class Solution {
    public int[] runningSum(int[] nums) {
        int[] n=new int[nums.length];
        int sum=0;
        int i=0;
        for(int it:nums){
            sum=sum+it;
            n[i]=sum;
            i++;
        }
        return n;
    }
}