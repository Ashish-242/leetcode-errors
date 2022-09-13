class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int maxA=0;
        int n=arr.length;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() && (i==n || arr[st.peek()] > arr[i])){
                int hightindex=st.pop();
                int height=arr[hightindex];
                
                int width=0;
                if(st.isEmpty()){
                   width=i;
                }else{
                    width=i-st.peek()-1;
                }
                maxA=Math.max(maxA,height*width);
            }
            st.push(i);
        }
        return maxA;
    }
}