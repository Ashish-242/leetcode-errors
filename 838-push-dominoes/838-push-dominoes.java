class Solution {
    public String pushDominoes(String s) {
        StringBuilder sb=new StringBuilder();
                s="L" + s + "R";
        char[] arr=s.toCharArray();
        int n=arr.length;
        int pi=0;
        for(int i=1;i<n;i++){
            if(arr[i]=='L'){
                if(arr[pi]=='L'){
                    for(int x=pi+1;x<i;x++){
                        arr[x]='L';
                    }
                }else if(arr[pi]=='R'){
                     int lo=pi+1;
                    int hi=i-1;
                    while(hi>lo){
                        arr[lo]='R';
                        arr[hi]='L';
                        lo++;
                        hi--;
                    }
                
            }
                pi=i;
            }else if(arr[i]=='R'){
                if(arr[pi]=='L'){
//                   do nothing
                }else if(arr[pi]=='R'){
                    for(int x=pi+1;x<i;x++){
                        arr[x]='R';
                    }
                }
                pi=i;
            }
        }
        for(int i=1;i<n-1;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}