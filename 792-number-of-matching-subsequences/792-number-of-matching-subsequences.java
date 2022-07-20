class Solution {
    public int numMatchingSubseq(String s, String[] words) {
      HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        char[] ch=s.toCharArray();
//         ch=[a,b,c,d,e];
        int count=0;
        int n=s.length();
        for(String sm : map.keySet()){
            char[] ss=sm.toCharArray();
            int i=0;
            int j=0;
            while(i<n){
                if(j==ss.length) break;
                if(ch[i]==ss[j]){
                    i++;
                    j++;
                }else i++;
            }
            if(j==ss.length){
                if(map.containsKey(sm))  count+=map.get(sm); 
            } 
        }
    return count;
    }
}