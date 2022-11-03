class Solution {
    public int longestPalindrome(String[] words) {
       
//             HashMap<String,Integer> map=new HashMap<>();
//         for(String it:words){
//             map.put(it,map.getOrDefault(it,0)+1);
//         }
       
//         int length=0;
//         boolean flag=false;
//         for(int i=0;i<words.length;i++){
//             String s=words[i];
//             StringBuilder sb2=new StringBuilder(s);
//             String s2=sb2.reverse().toString();
//             if(map.containsKey(s)){
//                 if(  map.containsKey(s2)){
//                 int add=Math.min(map.get(s),map.get(s2));
//                     if(s.equals(s2) && flag==false){
//                         flag=true;
//                         length+=add*2;
//                         map.remove(s);
//                     }else if(flag==true && s.equals(s2)){
//                         map.remove(s);
//                     }
                        
//                     else{
//                         length+=add*2*2;
//                            map.remove(s);
//                              map.remove(s2);
//                     } 
//             }else{
//                 map.remove(s);
//             }
//             }
            
//         }
//         return length;
//         this got fail
         HashMap<String,Integer> map=new HashMap<>();
        int length=0;
        for(String it:words){
            String s= ""+ it.charAt(1)+it.charAt(0);
            if(map.containsKey(s)){
                length+=4;
                if(map.get(s)==1) map.remove(s);
                else map.put(s,map.get(s)-1);
            }else{
                map.put(it,map.getOrDefault(it,0)+1);
            }
        }
        for(int i=0;i<26;i++){
            char curr=(char)(i+'a');
            String ss=""+curr+curr;
            if(map.containsKey(ss)){
                length+=2;
                break;
            }
        }
         return length;
    }
}