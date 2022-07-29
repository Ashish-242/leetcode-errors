class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res=new ArrayList<>();
        boolean flag=true;
        HashMap<Character,Integer> map1=new HashMap<>();
//         pattern map map1
        HashMap<Character,Integer> map2=new HashMap<>();
      
        
//         word strings map map2
        for(char ch:pattern.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(String s:words){
            for(char c:s.toCharArray()){
                map2.put(c,map2.getOrDefault(c,0)+1);
            }
            if(map2.size()==map1.size()){
                flag=true;
                 HashMap<Character,Integer> map3=new HashMap<>(map1);
                    
                for(int i=0;i<s.length();i++){
                   
                    if(map2.get(s.charAt(i))!=map3.get(pattern.charAt(i))){
                        flag=false;
                        break;
                    }
                    map3.put(pattern.charAt(i),map3.get(pattern.charAt(i)-1));
                    map2.put(s.charAt(i),map2.get(s.charAt(i)-1));
                }
                if(flag==true) res.add(s);
            }
                map2.clear();
            
        }
        return res;
    }
}