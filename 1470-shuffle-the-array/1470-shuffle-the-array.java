class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
       for(int i=0,x=0;i<n;i++,x=x+2){
           arr[x]=nums[i];
           arr[x+1]=nums[i+n];
       }
        // for(int j=n,y=1;j<2*n;j++,y=y+2)
        // {
        //     arr[y]=nums[j];
        // }
        return arr;
    }
}