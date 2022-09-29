class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        
     Arrays.sort(envelopes, (a, b) -> a[0] - b[0]==0? b[1]-a[1] :a[0]-b[0]);
    int max = 0;
    int dp [] = new int [envelopes.length+1];
    Arrays.fill(dp,Integer.MAX_VALUE);
        int len=0;
        int idx=0;
    dp[0]=0;
        for(int i=0;i<envelopes.length;i++){
            int index=Arrays.binarySearch(dp,0,len,envelopes[i][1]);
            if(index<0) index=-(index+1);
            dp[index]=envelopes[i][1];
            if(index==len){
                len++;
            }
        }
        return len;
        
    }

    //   for(int[] envelope : envelopes){
    //     int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
    //     if(index < 0)
    //         index = -(index + 1);
    //     dp[index] = envelope[1];
    //     if(index == len)
    //         len++;
    // }
    // return len;
}