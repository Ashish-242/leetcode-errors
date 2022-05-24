class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int m=0;
        Stack<Character> cs=new Stack<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            if(ch=='(') {
                cs.push(ch);
                st.push(i);
            }
            else {
                if(!cs.isEmpty() && cs.peek()=='('){
                    cs.pop();
                    st.pop();
                    m=Math.max(m,i-st.peek());
                }else{
                  st.push(i);
                }
            }
            
        }
    return m;

    }
}