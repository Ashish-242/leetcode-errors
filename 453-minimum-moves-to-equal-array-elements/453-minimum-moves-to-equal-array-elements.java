class Solution {
    public int minMoves(int[] nums) {
//         sochna tough  h mai soch nhi pa ra hu isko
        int mini=Integer.MAX_VALUE;
        for(int n:nums) mini=Math.min(mini,n);
        int res=0;
        for(int n:nums) res+=n-mini;
       return res; 
        
    }
}