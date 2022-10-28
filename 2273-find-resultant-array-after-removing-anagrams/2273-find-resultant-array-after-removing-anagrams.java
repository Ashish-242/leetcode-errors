class Solution {
    public List<String> removeAnagrams(String[] words) {
       List<String> res=new ArrayList<>();
        res.add(words[0]);
        for(int i=1;i<words.length;i++){
            
            String prevs=sort(words[i-1]);
            String currs=sort(words[i]);
            
            
            if(prevs.compareTo(currs)!=0){
                
                res.add(words[i]);
            }
          
           
         
        }
        return res;
    }
    public String sort(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}