class Solution {
    public int majorityElement(int[] arr) {
        int n=arr.length;
        int count=0;
       int x=0;
        int a=1;
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(count==0){
                x=arr[i];
                count++;
                continue;
            }
            if(arr[i]==x){
                count++;
            }else{
                count--;
            }
          
        }
        
        return x;
    }
}