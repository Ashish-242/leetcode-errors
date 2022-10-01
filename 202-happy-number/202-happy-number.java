class Solution {
    public boolean isHappy(int n) {
  if(n==1) return true;
        int sum=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(n,1);
        while(n>0 && n<Math.pow(2,31)-1){
            int r=n%10;
            sum+=r*r;
            n=n/10;
           
            
            if(n==0 && map.containsKey(sum)==false){
                if(sum==1) return true;
               n=sum;
                map.put(sum,1);
                sum=0;
            }else if(n==0 && map.containsKey(sum)) return false;
            
        }
        return false;
      
    }
}