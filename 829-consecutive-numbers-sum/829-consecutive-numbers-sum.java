class Solution {
    public int consecutiveNumbersSum(int n) {
        int res=0;
        int k=1;
        int check=k*(k-1)/2;
        int x=0;
        while(check<n){
           if((n-check)%k==0){
               res++;
           }
            k++;
            check=k*(k-1)/2;
        }
        
        
        return res;
    }
}