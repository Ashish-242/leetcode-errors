class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] p=new int[n];
        p[0]=0;
        for(int i=1;i<n;i++){
            if(nums[i]%2==nums[i-1]%2){
                //it means it is a violating point
                p[i]=p[i-1]+1;
            }else p[i]=p[i-1];
        }
        int j=0;
        boolean[] ans=new boolean[queries.length];
        //now check queries
        for(int[] q:queries){
            int start=q[0],end=q[1];
            if(p[end]-p[start]==0){
                //it means all adjacent elements have different parity
                ans[j++]=true;
            }else ans[j++]=false;
        }
        return ans;
    }
}