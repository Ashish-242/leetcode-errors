class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            sum^=nums[i];
        }
//         max=xor^k like 7=5^2  -- 7 is max,5 is xor,and k=2 
//         k=max^xor now k=7^5 then it is equal to 2 and how did we get 7  we get it by ((1<<maxbit)-1)  if maxbit=3
//         our case maxbit is 2 so we get k=3
//         2-0010
//         0010<<1  = 0100 => 0100-1=0011 which is equal to 3 
        double max2=Math.pow(2,maximumBit)-1;
        int max=(int) max2;
        for(int i=0;i<nums.length;i++){
            arr[i]=sum^max;
            sum^=nums[n-i-1];
        }
       return arr;
    }
}