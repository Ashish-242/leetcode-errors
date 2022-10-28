class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        
      
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
           String s1=comparestrings(strs[i]);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<String>());
            }
            map.get(s1).add(strs[i]);
        }
         for(String s:map.keySet()){
             res.add(map.get(s));
         }
        return res;
    }
    public String comparestrings(String ss){
        char[]ch=ss.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}