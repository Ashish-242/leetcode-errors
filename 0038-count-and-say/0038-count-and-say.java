class Solution {
    public String countAndSay(int n) {
           String res="1";
         for (int i = 1; i < n; i++) {
         
            res = getrle(res);
        }
         return res;
        
        
    }
    public String getrle(String ss){
            char[] ch=ss.toCharArray();
            String s="";
            int countno=1;
            for(int j=1;j<ch.length;j++){
                if(ch[j]==ch[j-1]) countno+=1;
                else{
                    s+=countno;
                    s+=ch[j-1];
                    countno=1;
                }
            }
            s+=countno;
            s+=ch[ch.length-1];
            return s;
        }
   
  
}