class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int val=nums[i]*nums[j];
                map.put(val,map.getOrDefault(val,0)+1);
            }

        }
        int count=0;
        for(int key:map.keySet()){
            int val=map.get(key);
            if(val>1){
               count+=(2*val)*(2*(val-1));
            }

        }
        return count;
    }
}