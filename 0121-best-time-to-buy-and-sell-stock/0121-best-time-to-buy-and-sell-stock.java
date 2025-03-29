class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==1) return 0;
        Stack<Integer> st=new Stack<>();
        int[] dp=new int[prices.length];
        dp[n-1]=0;
        st.add(prices[n-1]);
        for(int i=prices.length-2;i>=0;i--){
            if(st.peek() > prices[i]){
                dp[i]=st.peek()-prices[i];
            }else{
                dp[i]=0;
                st.add(prices[i]);
            }
        }
        int mx=0;
        for(int it:dp){
            mx=Math.max(it,mx);
        }
        if(mx==0) return 0;
        return mx;
    }
}