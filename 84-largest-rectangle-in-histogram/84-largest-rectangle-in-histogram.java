class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int[] left=new int[n];
        int[] right=new int[n];
        Stack<Integer> sleft=new Stack<>();

        //         left means storing left smallest 
        sleft.push(0);
        left[0]=0;
        for(int i=1;i<n;i++){
            while(sleft.size()>0 && arr[sleft.peek()] >= arr[i]){
                sleft.pop();
            }
            if(sleft.size()==0){
                left[i]=0;
            }else{
                left[i]=sleft.peek()+1;
            }
            sleft.push(i);
        }
        
        
//     right means storing right smallest
        Stack<Integer> sright=new Stack<>();
        sright.push(n-1);
        right[n-1]=n-1;
        for(int j=n-2;j>=0;j--){
             while(sright.size()>0 && arr[j] <= arr[sright.peek()]){
                sright.pop();
            }
            if(sright.size()==0){
                right[j]=n-1;
            }else{
                right[j]=sright.peek()-1;
            }
            sright.push(j);
        }
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int area=(right[i]-left[i] +1)*arr[i];
            mx=Math.max(mx,area);
        }
        return mx;
    }
}