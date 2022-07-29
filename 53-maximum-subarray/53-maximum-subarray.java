class Solution {
    public int maxSubArray(int[] arr) {
//         kadanes Algorithm for largest subarray
        int mx=Integer.MIN_VALUE;
        int n=arr.length;
    //   mx= max so far
    int mn=0;
    for(int i=0;i<n;i++){
        mn+=arr[i];
        if(mx<mn){
            mx=mn;
        }
        if(mn<0) mn=0;
    }
 return mx;
    
    }
}