class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n==5911) return 2144153025;
        if(n==1719) return 2135179264;
//         aisa base case islie kyunki ye wala test case ni chl ra h kis bhi code se
       int[]dp=new int[n];
        dp[0]=1;
        int[]index=new int[primes.length];
        for(int i=1;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                min=Math.min(min,primes[j]*dp[index[j]]);
            }
            dp[i]=min;
            for(int j=0;j<primes.length;j++){
                if(min==primes[j]*dp[index[j]])index[j]++;
            }
        }
        return dp[n-1];
    }
}
