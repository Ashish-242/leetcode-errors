class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
       int[] left=new int[nums.length];
       int[] right=new int[nums.length];
       right[n-1]=nums[n-1];
       
       for(int i=n-2;i>=0;i--){
        if(right[i+1] !=0){
            right[i]=nums[i]*right[i+1];
        }else right[i]=nums[i];
       }
      left[0]=nums[0];
         for(int i=1;i<n;i++){
        if(left[i-1] !=0){
            left[i]=nums[i]*left[i-1];
        }else left[i]=nums[i];
       }
       long mx=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
            long m=Math.max(right[i],left[i]);
            if(m>mx) mx=m;
       }
       return (int)mx;
    }
}