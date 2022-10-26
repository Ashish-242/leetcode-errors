class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] prefixarr=new int[arr.length];
        int[] ans=new int[queries.length];
        for(int i=0;i<arr.length;i++){
            if(i==0) prefixarr[0]=arr[0];
            else{
                prefixarr[i]=arr[i]^prefixarr[i-1];
            }
        }
        for(int i=0;i<queries.length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==0){
                ans[i]=prefixarr[r];
            }else{
                ans[i]=prefixarr[r]^prefixarr[l-1];
            }
        }
        return ans;
    }
}