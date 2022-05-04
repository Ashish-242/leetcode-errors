class Solution {
    int count=0;
    public void cal(int[] arr,int k,    HashMap<Integer,Integer> map){
   int i=0;
        int j=arr.length-1;
        while(i<j){
            if(i!=j && (arr[i]+arr[j])==k){
                count+=1;
                map.remove(i);
                map.remove(j);
                i++;
                j--;
            }else if(arr[i]+arr[j] >k) j--;
             else  i++;
        }
    }
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }
        cal(nums,k,map);
        return count;
    }
}