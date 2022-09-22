class Solution {
    public boolean isIsomorphic(String s, String t) {
          if(s.length()!=t.length()){                                           
          return false;
      }
      HashMap<Character,Character> map1=new HashMap<>();
       HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);;
            char ch2=t.charAt(i);
            
            if(!map1.containsKey(ch1) && !set.contains(ch2)){
                map1.put(ch1,ch2);
                set.add(ch2);
            } 
            else if(!map1.containsKey(ch1) && set.contains(ch2)){
                return false;
            }
            else {
                char ch=map1.get(ch1);
                if(ch2!=ch) return false;
            }
        }
        
      
		return true;
    }
}