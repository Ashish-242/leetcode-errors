class Solution {
    public int bagOfTokensScore(int[] arr, int power) {
        if(arr.length==0) return 0;
        else if(arr.length==1){
            if(arr[0] > power) return 0;
            else return 1;
        }
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int sc=0;
        int score=0;
        
        while(i<=j){
            if(arr[i] <=power){
                score++;
                power=power-arr[i];
                i++;
            }else if( score>0){
                power+=arr[j];
                j--;
                score--;
            }else break;
            sc=Math.max(score,sc);
        }
        return sc;
    }
}