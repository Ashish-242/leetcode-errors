class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] res=new int[nums.length];
        while(k>=0){
            if(Math.abs(nums[i])> Math.abs(nums[j])){
                res[k]=nums[i]*nums[i];
                i++;
            }else{
                res[k]=nums[j]*nums[j];
                j--;
            }
            k--;
            
        }
        return res;
    }
}