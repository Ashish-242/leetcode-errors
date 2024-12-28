class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0,count=0,max=0,n=nums.length,s=k;
        while(j<n){
            int x=nums[j];
            if(x==1){
                count++;
                j++;
            } 
            else if(x==0 && s>0){
                count++;
                s--;
                j++;
            }
            else {
               
                max=Math.max(count,max);
                if(k==0){
                    count=0;
                    j++;
                    i=j;
                }else{
                 if(nums[i]==0 && k>0) s++;
                count--;
                i++;
                }
               
            }
        }
        if(count>max) max=count;
        return max;
    }
}