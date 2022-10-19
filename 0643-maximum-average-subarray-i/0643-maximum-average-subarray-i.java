class Solution {
    public double findMaxAverage(int[] arr, int k) {
//         first calculate prefix sum 
//         take pointers
//         done by prefix sum
        double psum=0;
        int i=0,j=0;
        int n=arr.length;
        double mx=Integer.MIN_VALUE;
       while(i<k){
           psum+=arr[i];
           i++;
       }
        mx=Math.max(mx,psum);
        for( i=k;i<n;i++){
            psum+=arr[i]-arr[i-k];
            mx=Math.max(mx,psum);
        }
        return mx*1.0/k;
    }
}