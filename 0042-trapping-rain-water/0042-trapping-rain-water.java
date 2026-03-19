class Solution {
    public int trap(int[] height) {
        int n=height.length;
       int[] right=new int[n];
       int [] left= new int[n];
       right[n-1]=0;
       int greatervalue=height[n-1];
       for(int i=n-2;i>=0;i--){
         if(height[i]> greatervalue){
            right[i]=0;
            greatervalue=height[i];
         }
         else{
            right[i]=greatervalue;
         }
       } 
       left[0]=0;
        greatervalue=height[0];
       for(int i=1;i<n;i++){
         if(height[i]> greatervalue){
            left[i]=0;
            greatervalue=height[i];
         }
         else{
            left[i]=greatervalue;
         }
       }

       int sum=0;
       for(int i=0;i<n;i++){
        int min=Math.min(left[i],right[i]);
        if(min!=0) min-=height[i];
        sum+=min;
       }
       return sum;
    }
}