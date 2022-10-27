class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String ans="";
        int start=0;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.size()==0 && flag==true){
                String ss=s.substring(start+1,i-1);
                ans+=ss;
                flag=false;
            }
            if(ch=='(') {
                st.push(ch);
                if(st.size()==1){
                    start=i;
                    flag=true;
                }
                
            }else if(ch==')' && st.size()>0 && st.peek()=='(' ){
                st.pop();
            }
        }
        if(st.size()==0){
            String ss=s.substring(start+1,s.length()-1);
            ans+=ss;
        }
        return ans;
    }
}