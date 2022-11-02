class Solution {
    public int[] avoidFlood(int[] arr) {
        int[] ans=new int[arr.length];
        int k=0;
        HashMap<Integer,Integer> map=new HashMap<>();
       TreeSet<Integer> set=new TreeSet();
         
        
       
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            if(x == 0 ){
                set.add(i);
                ans[i]=1;
            }else{
               if(map.containsKey(x)) {
                   if(set.higher(map.get(x))==null){
                       return new int[0];
                   }else{
                       int dryx=set.higher(map.get(x));
                       set.remove(dryx);
                       map.put(x,i);
                       ans[dryx]=x;
                       ans[i]=-1;
                   }
                     
               }else{
                map.put(x,i);
                ans[i]=-1;
               
               }
            }
            
        }
        return ans;
    }
}