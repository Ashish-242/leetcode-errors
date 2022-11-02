class Solution {
   
    int top;
    Random r;
    HashMap<Integer,Integer> map;
    public Solution(int n, int[] blacklist) {
    
        map=new HashMap<>();
        r=new Random();
      top=n-blacklist.length;
        
        HashSet<Integer> set=new HashSet<>();
        for(int it:blacklist){
            set.add(it);
        }
        n--;
        for(int i=0;i<blacklist.length;i++){
            if(blacklist[i] < top){
//                 now we have to point this no to end so we check from end that last no is blacklisted or not
//                 if it is then do n-- and it it is not then put this lastelement to this no in map
                while(set.contains(n)){
                    n--;
                }
                map.put(blacklist[i],n);
                n--;
            }
        }
    }
    
    public int pick() {
        int randoimindex=r.nextInt(top);
       if(map.containsKey(randoimindex)){
           return map.get(randoimindex);
       }
        return randoimindex;
    }
   
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(n, blacklist);
 * int param_1 = obj.pick();
 */