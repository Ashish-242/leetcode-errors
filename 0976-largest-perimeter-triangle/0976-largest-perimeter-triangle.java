class Solution {
    public int largestPerimeter(int[] A) {
//         int n=arr.length;
//         if(n<3) return 0;
//         Arrays.sort(arr);
//         int ans=0;
//         int mx=Integer.MIN_VALUE;
//         if(n==3){
//             if(arr[0]+arr[1]>arr[2]){
//                 ans=arr[0]+arr[1]+arr[2];
//                 return ans;
//             }else{
//                 return 0;
//             }
//         }else{
//             for(int i=0;i<n-2;i++){
                
//                     ans=arr[i]+arr[i+1]+arr[i+2];
//                 mx=Math.max(ans,mx);
                
//             }
//         }
//         return mx;
        
        Arrays.sort(A);
        for (int i = A.length - 1; i > 1; --i)
            if (A[i] < A[i - 1] + A[i - 2])
                return A[i] + A[i - 1] + A[i - 2];
        return 0;
    }
    
}