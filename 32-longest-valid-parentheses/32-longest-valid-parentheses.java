class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Integer> st=new Stack<>();
        // st.push(-1);
        int m=0;
        int x=-1;
       
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
            if(ch=='(') {
                st.push(i);
           
            
                // st.push(i);
            }
            else {
               if(st.isEmpty()) x=i;
                else{
                    st.pop();
                    if(st.isEmpty()) m=Math.max(m,i-x);
                    else m=Math.max(m,i-st.peek());
                }
            }
            
        }
    return m;

    }
}