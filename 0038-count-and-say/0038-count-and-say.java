class Solution {
    public String countAndSay(int n) {
           String res="1";
         for (int i = 1; i < n; i++) {
         
            res = getrle(res);
        }
         return res;
        
        
    }
    public String getrle(String s){
            StringBuilder sb=new StringBuilder();
        
        char ch=s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==ch) count++;
            else{
                sb.append(count);
                sb.append(ch);
                count=1;
                ch=s.charAt(i);
            }
        }
        sb.append(count);
        sb.append(ch);
        return sb.toString();
        }
   
  
}