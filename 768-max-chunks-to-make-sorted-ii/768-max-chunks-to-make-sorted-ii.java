class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] right=new int[n+1];
        int mn=0;
        right[right.length-1]=Integer.MAX_VALUE;
        for(int i=right.length-2;i>=0;i--){
            mn=Math.min(right[i+1],arr[i]);
            right[i]=mn;
        }
        int[] leftmax=new int[n];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
            
            leftmax[i]=mx;
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(leftmax[i]<=right[i+1]){
                count++;
            }
        }
        return count;
    }
}