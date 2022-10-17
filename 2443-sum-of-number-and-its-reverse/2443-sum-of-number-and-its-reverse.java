class Solution {
    public boolean sumOfNumberAndReverse(int num) {
         HashSet<Integer> set=new HashSet<>();
        
        if(num==0) return true;
        for(int i=1;i<num;i++){
            StringBuilder sb=new StringBuilder(Integer.toString(i));
            String s=sb.reverse().toString();
            int x=Integer.parseInt(s);
           if((i+x) == num) return true;
        }
        return false;
       
        
    }
}