
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
         if(nums.length == 1)return nums[0];
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        int x=0;
     
        for(int i=0;i<n;i++){
            if(i!=0) {
                temp1[x]=nums[i];
                x++;
            } 
            if(i!=n-1){
                temp2[i]=nums[i];
            }
        }
       

         int ans=Math.max(mem(temp1),mem(temp2));
        
        return ans;
    }
  
    public int mem(int[] arr){
       int prev=arr[0];
        int prev2=0;
        for(int i=1;i<arr.length;i++){
            int take=arr[i];
            if(i>1) take+=prev2;
            int ntake=prev;
            
            int curr=Math.max(take,ntake);
            prev2=prev;
            prev=curr;
            
        }
        return prev;
        
    }
     }