class Solution {
    public String reverseWords(String s) {
        String[] ss=s.split(" ");
        String ans="";
        for(int i=0;i<ss.length;i++){
            StringBuilder sb=new StringBuilder(ss[i]);
            ans+=sb.reverse().toString();
            if(i!=ss.length-1) ans+=" ";
        }
        return ans;
    }
}