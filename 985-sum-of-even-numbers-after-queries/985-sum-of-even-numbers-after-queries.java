class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] q) {
        int n=arr.length;
        int[] ans=new int[n];
        int sum=0;
      for(int val: arr){
          if(val%2==0) sum+=val;
      }
        int k=0;
        for(int i=0;i<q.length;i++){
            int index=q[i][1];
            int value=q[i][0];
            if(arr[index]%2==0){
                sum-=arr[index];
            
           
            }
              arr[index]+=value;
              if(arr[index]%2==0){
                sum+=arr[index];
            }
            ans[k]=sum;
            k++;
           
        }
        return ans;
    }
}