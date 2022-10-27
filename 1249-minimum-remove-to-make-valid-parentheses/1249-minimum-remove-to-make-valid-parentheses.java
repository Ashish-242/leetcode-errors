class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder(s);
        
        for(int i=0;i<s.length();i++){
            char ch=sb.charAt(i);
           if(ch=='(') st.push(i);
            else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                    
                }else {
                    sb.setCharAt(i,'*');
                }
            }
        }
        while(!st.isEmpty()){
            sb.setCharAt(st.pop(),'*');
        }
        return sb.toString().replaceAll("\\*","");
        
    }
}