class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] arr=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(i<nums.length){
            if(nums[i]%2!=0){
                arr[j]=nums[i];
                j--;
               
            }else{
                arr[k]=nums[i];
               
                k++;
            }
             i++;
         
        }
        return arr;
    }
}