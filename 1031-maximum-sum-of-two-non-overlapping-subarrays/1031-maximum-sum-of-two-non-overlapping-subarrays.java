class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int max1=getmax(nums,firstLen,secondLen);
        int max2=getmax(nums,secondLen,firstLen);
        int ans=Math.max(max1,max2);
        return ans;
    }
    public int getmax(int[] nums,int f,int s){
        int n=nums.length;
        int sum=0;
        int[] left=new int[n];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i==f-1) left[i]=sum;
            else if(i>=f){
                sum-=nums[i-f];
                left[i]=Math.max(left[i-1],sum);
            }
        }
        int[] right=new int[n];
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            if(i==nums.length-s) right[i]=sum;
            else if(i<nums.length-s){
                sum-=nums[i+s];
                right[i]=Math.max(sum,right[i+1]);
            }
            
        }
        
        int maxans=Integer.MIN_VALUE;
        for(int i=f-1;i<nums.length-s;i++){
            maxans=Math.max(maxans,left[i]+right[i+1]);
        }
        return maxans;
    }
}