class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int lastindex=-1;
        for(int [] trip:trips){
            lastindex=Math.max(lastindex,trip[2]);
        }
        int[] arr=new int[lastindex+1];
        for(int[] trip:trips){
            arr[trip[1]]+=trip[0];
            arr[trip[2]]+=trip[0]*-1;
        }
//         cumlative sum for kaha se kaha tak kitne log baithe hue the car meio janne ke liye 
        for(int i=1;i<=lastindex;i++){
            arr[i]+=arr[i-1];
            if(arr[i]> capacity || arr[0]>capacity) return false;
        }
        return true;
    }
}