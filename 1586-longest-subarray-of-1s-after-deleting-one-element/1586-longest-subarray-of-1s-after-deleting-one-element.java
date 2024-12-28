class Solution {
    public int longestSubarray(int[] nums) {
        int i=0,j=0,count=0,max=0,n=nums.length,st=1;
        boolean flag=true;
        while(j<n){
            int x=nums[j];
            if(x==1){
                count++;
                j++;
            }else if(x==0 && st>0){
                j++;
                st--;
                flag=false;
            }else{
                  max=Math.max(max,count);
                if(nums[i]==0) {
                   
                    st++;
                }else{
                    count--;
                }
               
                i++;
            }
        }
          max=Math.max(max,count);
          if(flag==true && n>0) return max-1;
          return max;
    }
}