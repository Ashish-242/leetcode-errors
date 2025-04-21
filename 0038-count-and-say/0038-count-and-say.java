class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        int i=2;
        String[] r=new String[n+1];
        r[1]="1";
        while(i<=n){
            String val=r[i-1];
            char[] ch=val.toCharArray();
            int countno=1;
            String s="";
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
            r[i]=s;
            i++;
        }
    return r[r.length-1];
    }
  
}