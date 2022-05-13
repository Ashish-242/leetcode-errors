class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
Stack<Character> st= new Stack<>();

        for(int i=0;i<s.length();i++){
                   char ch=s.charAt(i);
            if(st.isEmpty()) st.push(ch);
     
            else if(ch==st.peek()) st.push(ch);
            else if(ch!=st.peek()){
          st.pop();
                if(st.isEmpty()) count+=1;
                
            }
        }
        return count;
    }
}