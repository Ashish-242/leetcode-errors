// using array instead of arraylist
class Solution {
    class Pair {
         public int pt=0;
       public int gt=0;
        Pair(int pt,int gt){
           this.pt=pt;
            this.gt=gt;
        }

    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        Pair[] list=new Pair[plantTime.length];
        for(int i=0;i<plantTime.length;i++){
            Pair r=new Pair(plantTime[i],growTime[i]+1);
            list[i]=r;
        }
        Arrays.sort(list,(a,b)->b.gt-a.gt);
       
        int j=0;
        int mx=0;
     for(int i=0;i<list.length;i++){
         Pair res=list[i];
         int x=res.pt;
         int y=res.gt;
         j+=x;
         mx=Math.max(mx,j+y-1);
     }
        return mx;
    }
}