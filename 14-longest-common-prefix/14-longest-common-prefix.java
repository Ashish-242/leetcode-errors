class Solution {
    public String longestCommonPrefix(String[] strs) {
      if(strs==null || strs.length==0) return "";
        Arrays.sort(strs);
        int c=0;
        int j=strs.length-1;
        String ss=strs[j];
        String s=strs[0];
        String res="";
        while(c<s.length()){
            if(s.charAt(c) ==ss.charAt(c) ){
               c++;
            }else break;
            
        }
       return c==0?"":s.substring(0,c);
    }
}
 