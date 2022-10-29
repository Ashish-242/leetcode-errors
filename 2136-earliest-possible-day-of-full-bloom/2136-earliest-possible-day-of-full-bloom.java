class Solution {
    class Pair {
         public int pt=0;
       public int gt=0;
        Pair(int pt,int gt){
           this.pt=pt;
            this.gt=gt;
        }
        // public int compare(Pair a,Pair b){
        //     if(a.gt==b.gt){
        //         return a.pt-b.pt;
        //     }
        //     return b.gt-a.gt;
        // }
    }
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        ArrayList<Pair> list=new ArrayList<>();
        for(int i=0;i<plantTime.length;i++){
            Pair r=new Pair(plantTime[i],growTime[i]+1);
            list.add(r);
        }
        Collections.sort(list,(Pair a,Pair b)->{
          if (a.gt > b.gt) return -1;
            else if (a.gt < b.gt) return 1;
            else return 0;
        });
        //   Collections.sort(flowers, (Pair a, Pair b)->{  //OR "return (a.growTime - b.growTime)"
        //     if (a.growTime > b.growTime) return -1;
        //     else if (a.growTime < b.growTime) return 1;
        //     else return 0;
        // });
        int j=0;
        int mx=0;
     for(int i=0;i<list.size();i++){
         Pair res=list.get(i);
         int x=res.pt;
         int y=res.gt;
         j+=x;
         mx=Math.max(mx,j+y-1);
     }
        return mx;
    }
}