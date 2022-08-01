class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr=new int[60];
        int count=0;
        for(int i=0;i<time.length;i++){
            int x=time[i]%60;
            if(x==0) count+=arr[0];
            else{
                count+=arr[60-x];
            }
            arr[x]++;
        }
        return count;
    }
}