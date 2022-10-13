class Solution {
    public int largestPerimeter(int[] arr) {
        int n=arr.length;
        if(n<3) return 0;
        Arrays.sort(arr);
        int ans=0;
        int mx=0;
      
        
            for(int i=n-1;i>1;i--){
                if(arr[i-1] + arr[i-2] > arr[i]){
                    ans=arr[i]+arr[i-1]+arr[i-2];
                mx=Math.max(ans,mx);
            }
                
         }
        return mx;
     
    }
    
}