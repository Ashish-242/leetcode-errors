class Solution {
    public String minWindow(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(n>m) return "";
        HashMap<Character,Integer> tmap=new HashMap<>();
        
        for(char ch:t.toCharArray()){
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }
         HashMap<Character,Integer> smap=new HashMap<>();
        String ss="";
//         acquire release strategy
        int i=0;
        int j=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        while(i<m){
                  while(j<m && count!=n){
            char ch=s.charAt(j);
            if(tmap.containsKey(ch)){
                
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                    if(smap.get(ch)>tmap.get(ch)){}     
                    else count+=1;        
            }
                        j++;
            }
                 int x=j-i;   /* length of substring*/
            // System.out.println(count);
            if(count==n && min>x){
                min=x;
                ss=s.substring(i,j); /*  substring*/
            }            
         if(tmap.containsKey(s.charAt(i))){
                char ch=s.charAt(i);
//                  it is a useful character
                 smap.put(ch,smap.get(ch)-1);
                 if(smap.get(ch) < tmap.get(ch)) count--; 
                     //we lose one character  
         }
                i++;
        }   
            return ss;  
    }
}