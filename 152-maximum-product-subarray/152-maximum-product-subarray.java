class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int res=Integer.MIN_VALUE;
        int prd=1;
        for(int i=0;i<n;i++){
            prd=prd*arr[i];
            if(res<prd) res=prd;
            if(prd==0) prd=1;
        }
        prd=1;
        
        for(int i=n-1;i>=0;i--){
            prd=prd*arr[i];
            if(res<prd) res=prd;
            if(prd==0) prd=1;
        }
        return res;
    }
}