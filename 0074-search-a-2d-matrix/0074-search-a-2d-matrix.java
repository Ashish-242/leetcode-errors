class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[]arr=new int[n*m];
        int i=0;
        for(int[] ar:matrix){
            for(int it:ar){
                arr[i]=it;
                i++;
            }
         }
   
    int lo=0;
    int hi=arr.length-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==target){
            return true;
        }else if(arr[mid]> target){
            hi=mid-1;
        }else{
            lo=mid+1;
        }
    }
    return false;
    }
}