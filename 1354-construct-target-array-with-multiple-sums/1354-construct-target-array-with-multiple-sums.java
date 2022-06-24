class Solution {
    public boolean isPossible(int[] target) {
        long sum=0;
        int max=0;
        for(int i=0;i<target.length;i++){
            sum+=target[i];
            if(target[i]>target[max]) max=i;
        }
        long diff=sum-target[max];
        if(target[max]==1 || diff==1) return true;
//         [1,1000] diff==1
//         [1,1,1,1,1] max==1
//         [1,2,1] =diff==0
//         [1,2,2] diff>target[max];
//         target[max]%diff==0  [20,5]
        if(diff==0 || diff> target[max] || target[max]%diff==0 ) return false;
        
        target[max]%=diff;
        return isPossible(target);
    }
}