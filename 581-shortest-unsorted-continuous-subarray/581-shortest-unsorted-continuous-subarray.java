class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=new int[nums.length];
         arr=nums.clone();
        Arrays.sort(arr);
        int i=0;
        int j=nums.length-1;
    while(i<j){
        if(arr[i]==nums[i]) i++;
        else if(arr[j]==nums[j]) j--;
        else break;
    }
        return j-i==0?0:j-i+1;
    }
}