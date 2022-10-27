class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
       int[] ans=new int[n];
        
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                st.push(i);
              ans[i]=0;
                continue;
            }
                int check=0;
                while(!st.isEmpty() && temp[st.peek()]<= temp[i]){
                    check+=ans[st.peek()];
                    st.pop();
                    
                }
                if(st.isEmpty()){
                    st.push(i);
                    check=0;
                    ans[i]=0;
                }
                else if(check==0) {
                ans[i]=1;
                  st.push(i);  
                }else{
                    st.push(i);
                    ans[i]=check+1;
                }
          
            
        }
        return ans;
        
    }
}