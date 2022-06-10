class Solution {
    public void reverse(int s,int e,int[]nums){
        while(s<e){
            int xx=nums[s];
            nums[s]=nums[e];
            nums[e]=xx;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length-1;
      int i=0;
        boolean flag=false;
        int val=0;
        for( i=n-1;i>=0;i--){ 
            if(nums[i]<nums[i+1]){
                val=i;
                flag=true;
                break;
            }
        }
        if(flag==false){
            Arrays.sort(nums);
            return;
            
        }
        for(int j=n;j>=0;j--){
            if(nums[j]>nums[val]){
                int temp=nums[j];
                nums[j]=nums[val];
                nums[val]=temp;
                break;
                
             
            }
        }
           reverse(val+1,n,nums);
    }
}