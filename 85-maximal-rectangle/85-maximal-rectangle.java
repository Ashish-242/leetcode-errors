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
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] height=new int[m];
        int maxarea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1') height[j]+=1;
                else height[j]=0;
                
            }
            int area=largestRectangleArea(height);
                maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}