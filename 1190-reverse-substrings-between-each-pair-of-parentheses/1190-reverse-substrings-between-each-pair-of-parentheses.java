class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(ch==')' && !st.isEmpty()){
                swap(sb,st.peek()+1,i-1);
                st.pop();
            }
        }
        String ss=sb.toString().replaceAll("\\(","").replaceAll("\\)","");
        // ss.replaceAll("\\(","");
        // ss.replaceAll("\\)","");
        return ss;
    }
    public void swap(StringBuilder s,int i,int j){
        while(i<j){
            char ch=s.charAt(i);
            s.setCharAt(i,s.charAt(j));
            s.setCharAt(j,ch);
            i++;
            j--;
            
        }
    }
}