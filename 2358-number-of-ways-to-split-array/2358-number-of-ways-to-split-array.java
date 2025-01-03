class Solution {
    public int waysToSplitArray(int[] nums) {
        long first=0,second=0;
       long  totalsum=0;
        long validsplits=0;
        for(int it:nums) totalsum+=it;
        for(int i=0;i<nums.length-1;i++){
            first+=nums[i];
            if(first >= totalsum-first)
            validsplits+=1;

        }
        return (int)validsplits;
    }
}