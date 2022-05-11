class Solution {
    public String longestPalindrome(String s) {
        int n =s.length();
        int[][] dp=new int[n][n];
        int len=0,count=0,first=0;
        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){
                if(gap==0){
                    dp[i][j]=1;
                    
                }else if(gap==1 && s.charAt(i)==s.charAt(j)){
                    dp[i][j]=2;
                }else{
                    dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1]>0? dp[i+1][j-1]+2 : 0;
                }
                if(dp[i][j]>len){
                    len=dp[i][j];
                    first=i;
                }
                // count+=dp[i][j]>0?1:0;
                
            }
        }
        System.out.println(len);
        return s.substring(first,first+len);
        
    }
}