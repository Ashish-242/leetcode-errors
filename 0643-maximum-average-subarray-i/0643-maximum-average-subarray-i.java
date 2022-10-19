class Solution {
    public double findMaxAverage(int[] arr, int k) {
//         first calculate prefix sum 
//         take pointers
        double psum=0;
        int i=0,j=0;
        int n=arr.length;
        double mx=Integer.MIN_VALUE;
        while(j<n){
            if(j<k){
                psum=psum+arr[j];
            }else {
                mx=Math.max(mx,psum/k);
                psum+=arr[j]-arr[i];
                i++;
                
            }
            j++;
            
        }
        mx=Math.max(mx,psum/k);
        return mx;
    }
}