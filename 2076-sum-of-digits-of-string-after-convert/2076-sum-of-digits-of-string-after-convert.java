class Solution {
    public int getLucky(String s, int k) {
        int len=s.length();
            StringBuilder sb=new StringBuilder(s);
            char[] ch=sb.toString().toCharArray();
           sb=new StringBuilder();
          
            for(char c:ch){
                int seq=(int)(c)-96;
                sb.append(seq);
            }

     
        while(k-->0){
              char[] c2=sb.toString().toCharArray();
            int sum=0;
            
            for(char c:c2){
           int seq=c-'0';
                System.out.println(seq);
                 while(seq>0){
                int rem=seq%10;   
                sum+=rem;
                seq=seq/10;
            }
            }
            sb=new StringBuilder();
            sb.append(sum);
        
        }
        return Integer.parseInt(sb.toString());
    }
}