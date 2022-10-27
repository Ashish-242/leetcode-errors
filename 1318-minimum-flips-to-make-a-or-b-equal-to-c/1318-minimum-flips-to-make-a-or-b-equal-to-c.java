class Solution {
    public int minFlips(int a, int b, int c) {
        
        int count=0;
        
        for(int i=0;i<32;i++){
            boolean ch1=false;
            boolean ch2=false;
            boolean ch3=false;
             if((a & (1 << i)) >0) ch1=true;
             if((b & (1<<i)) >0) ch2=true;
           if((c & (1<<i)) >0) ch3=true;
            if(ch3){
                if(!ch1 & !ch2){
                    count++;
                }
            }else{
                if(ch1 & ch2){
                    count+=2;
                }else if(ch1 || ch2) count++;
            }
            
        }
        return count;
    }
}