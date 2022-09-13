class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i] >= st.peek()){
               st.pop();
                
            }
          st.push(arr[i]);
        }
        int[] count=new int[n];
        for(int j=arr.length-1;j>=0;j--){
            while(st.size()>0 && arr[j] >= st.peek()){
               st.pop();
                
            }
          if(st.size()!=0) count[j]=st.peek();
            else{
                count[j]=-1;
            }
              
       st.push(arr[j]);
          
        }
        return count;
    }
}