class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<as.length;i++){
            if(st.size()== 0 || as[i]>0 || st.peek()<0) st.push(as[i]);
          
            else{
                
                int ns=Math.abs(as[i]);
                while( st.size() > 0 && st.peek()> 0 && Math.abs(st.peek()) < ns){
                    st.pop();
                } 
                if(st.size()==0 || st.peek()<0) st.push(as[i]);
                else if (st.size()>0 && Math.abs(st.peek())== ns){
                    st.pop();
                }else{
//                     do nothing
                }
            }
        }
        int[] ar=new int[st.size()];
        int i=st.size()-1;
        while(st.size()>0){
        ar[i]=st.peek();
            st.pop();
            i--;
        }
        return ar;
    }
}