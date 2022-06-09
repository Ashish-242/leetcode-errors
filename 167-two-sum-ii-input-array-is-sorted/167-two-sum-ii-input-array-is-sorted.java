class Solution {
    public int[] twoSum(int[] num, int tar) {
        int s=0,e=num.length-1;
        while(num[s]+num[e]!=tar){
            if(num[s]+num[e]>tar) e--;
            else s++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr=new int[2];
        arr[0]=s+1;
            arr[1]=e+1;
        return arr;
    }
}