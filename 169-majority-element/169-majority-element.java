class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i]) > n/2){
              ans= arr[i];
            }
            
        }
        return ans;
    }
}