class Solution {
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        if(n==1) return 1;
        int i=0;
        int j=1;      
        int k=1;
        while(j<n){
            if(arr[i]==arr[j]) {
                arr[j]=0;
               
            }else{
                swap(i+1,j,arr);
                k++;
                i++;
                
            }
             j++;
        }
        return k;
        
    }
}