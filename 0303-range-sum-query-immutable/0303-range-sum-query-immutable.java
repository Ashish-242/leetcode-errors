class NumArray {

    public int[] arr;
    public int[] prefixarr;
    public NumArray(int[] nums) {
       
        prefixarr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefixarr[i+1]=prefixarr[i]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixarr[right+1]-prefixarr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */