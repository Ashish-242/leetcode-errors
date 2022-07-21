class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set=new HashSet<>();
       String vow="aeiouAEIOU";
        char[] ch=vow.toCharArray();
        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }
        
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            
            while(i<j && !set.contains(sb.charAt(i))){
                i++;
            }
            while(i<j && !set.contains(sb.charAt(j))){
                j--;
            }
           char one=sb.charAt(i);
           char two=sb.charAt(j);
            
              sb.setCharAt(i,two);
              sb.setCharAt(j,one);
                
                    
                i++;
                j--;
            
           
            // if(!set.contains(one)&& !set.contains(two)){
            //     i++;
            //     j--;
            // }
            // else if(set.contains(one)&& !set.contains(two)){
            //     j--;
            // }else if(!set.contains(one)&& set.contains(two)){
            //     i++;
            // }else{
               
              
            // }
            
            
        }
        return sb.toString();
        
    }
}