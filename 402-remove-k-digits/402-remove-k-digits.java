class Solution {
    public String removeKdigits(String num, int k) {
        if(k==0) return num;
        if(k==num.length()) return "0";
        Stack<Integer> st=new Stack<>();
       int s=num.charAt(0)-'0';
        st.push(s);
        for(int i=1;i<num.length();i++){
           int x=num.charAt(i)-'0';
            while(st.size() > 0 && st.peek()> x && k>0){
                k--;
                st.pop();
            }
            st.push(x);
        }
        while(k-->0) st.pop();
        StringBuilder sb=new StringBuilder();
        
        while(st.size()>0){
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
     
        while (sb.toString().startsWith("0")) {
            sb.deleteCharAt(0);

        }
         return sb.length() == 0 ? "0" : sb.toString();
        // if(sb.charAt(0)=='0' && sb.length()>1) {
        //     return sb.substring(1,sb.length()).toString();
        // }
        // return sb.toString();

    }
}