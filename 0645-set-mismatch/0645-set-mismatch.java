class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
       HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])!=-1){
                list.add(nums[i]);
                map.put(nums[i],-1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        // Arrays.sort(arr);
        return arr;
    }
}