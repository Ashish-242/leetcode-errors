class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int i=0;
        int j=0;
        int s=0;
        while(j<nums.length){
          if(nums[j]==0){
             s++; 
          }
            while(s>k){
                if(nums[i]==0)s--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
      
        return ans;
    }
}