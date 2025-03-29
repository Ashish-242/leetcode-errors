class Solution {
    public void nextPermutation(int[] nums) {

        //https://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order
        //refer to this link to understand about permutation in lexicographically
        int k=-1;
        //this is the index to swap
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                k=Math.max(k,i-1);
            }
        }
        if(k==-1) {
            int[] arr=new int[nums.length];
              for(int i=0;i<nums.length;i++){
              arr[i]=  nums[i];
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                nums[i]=arr[i];
            }
        }else{
            int greaterthank=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>nums[k]){
                    greaterthank=Math.max(greaterthank,i);
                }
            }
            //swap the terms
            int temp=nums[k];
            nums[k]=nums[greaterthank];
            nums[greaterthank]=temp;

            int j=k+1,n=nums.length-1;
            while(j<n){
                int tem=nums[j];
            nums[j]=nums[n];
            nums[n]=tem;
            j++;
            n--;
            }
        }

    }
}