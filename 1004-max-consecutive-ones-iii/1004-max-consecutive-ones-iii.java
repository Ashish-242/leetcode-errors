class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans=0;
        int i=0;
        int j=0;
        int s=k;
        while(j<nums.length){
          
            if(nums[j]==1) j++;
            else{
                if(s==0){
                    ans=Math.max(ans,j-i);
                    if(nums[i]==0) {
                        i++;
                        s++;
                    }else i++;
//                     aquire
                    
                }else{
                    s--;
                    j++;
                }
            }
        }
        ans=Math.max(ans,j-i);
        return ans;
    }
}