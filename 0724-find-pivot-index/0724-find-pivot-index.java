class Solution {
    public int pivotIndex(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int i=1,j=nums.length-2;
        int lsum=0,rsum=0;
        left[0]=0;right[nums.length-1]=0;
        while(i<nums.length){
            lsum+=nums[i-1];
            left[i]=lsum;
            i++;
        }
          while(j>=0){
            rsum+=nums[j+1];
            right[j]=rsum;
            j--;
        }
        for(int k=0;k<nums.length;k++){
            System.out.println(left[k]+"-"+ right[k]);
        }
        for(int k=0;k<nums.length;k++){
         //   System.out.println(left[k]+"-"+ right[k]);
            if(left[k]==right[k]){
                return k;
            }
        }
         

         return -1;



    }
}