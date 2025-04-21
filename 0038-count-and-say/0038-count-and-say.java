class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String val=countAndSay(n-1);
        String res=getrle(val);
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