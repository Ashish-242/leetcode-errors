class Solution {
    public int compare(String a,String b){
        if(Math.abs(a.length()-b.length())!=1) return 0;
        int count=0;
       int i=0,j=0;
        while(i<a.length()  && j<b.length()){
             char ch1=a.charAt(i);
            char ch2=b.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            }
            else{
                count++;
                i++;
            }
        }
        while(j<b.length()){
            j++;
            count++;
        }
          while(i<a.length()){
            i++;
            count++;
        }
        return count;
    }
    public int longestStrChain(String[] words) {
       Arrays.sort(words,new Comparator<String>(){
           public int compare(String a,String b){
               return a.length()-b.length();
           }
       });
        int n=words.length;
        int[] dp=new int[n];
        int omax=0;
       for(int i=0;i<dp.length;i++){
           int max=0;
           for(int j=0;j<i;j++){
               
             if(compare(words[i],words[j])==1){
                   if(dp[j]> max){
                       max=dp[j];
                   }
               }
           }
           dp[i]=max+1;
           if(dp[i] > omax) {
               omax=dp[i];
           }
       }
        return omax;
    }
}