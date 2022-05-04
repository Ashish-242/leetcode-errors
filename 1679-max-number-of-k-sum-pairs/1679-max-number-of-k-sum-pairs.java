class Solution {
    int count=0;
    public void cal(int[] arr,int k){
   int i=0;
        int j=arr.length-1;
        while(i<j){
            if(i!=j && (arr[i]+arr[j])==k){
                count+=1;
               
                i++;
                j--;
            }else if(arr[i]+arr[j] >k) j--;
             else  i++;
        }
    }
    public int maxOperations(int[] nums, int k) {
       
        Arrays.sort(nums);
       
        cal(nums,k);
        return count;
    }
}