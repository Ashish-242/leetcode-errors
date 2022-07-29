class Solution {
     public int lengthOfLIS(int[] arr) {
        
        int n=arr.length;
        if(n==1) return 1;
        int[] dp=new int[n];
         int maxlen=1;
           for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]< arr[i]){
            dp[i]=Math.max(dp[i],dp[j]+1);
                    maxlen=Math.max(dp[i],maxlen);
            }
            }
        }
        return maxlen; 
    }
   
}