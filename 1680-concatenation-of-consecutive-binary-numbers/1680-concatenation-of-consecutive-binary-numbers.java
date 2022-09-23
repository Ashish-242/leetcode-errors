class Solution {
    public int concatenatedBinary(int n) {
//         bit manipulation
//         for every even no i&i-1==0 like
//         for 4- 0100 & 3=0011 == 0 so when ever we have a even no we increase the bit count;
//     here the idea is to set the current no based on the previous no 
        long mod=(long)1e9+7;
        long ans=0;
        int bitno=0;
        for(int i=1;i<=n;i++){
            if((i & (i-1))==0){
//                 then it is a even no so increase bitno
                bitno+=1;
            }
            ans=(ans<<bitno | i)%mod;
        }
        return (int) ans;
    }
}