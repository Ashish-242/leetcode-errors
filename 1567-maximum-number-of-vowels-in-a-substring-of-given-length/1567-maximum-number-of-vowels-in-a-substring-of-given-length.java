class Solution {
    public int maxVowels(String s, int k) {
        int st=0,e=0;
        int maxcount=Integer.MIN_VALUE,count=0;
        while(e<s.length()){
            char c=s.charAt(e);
            if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u') count++;
            if(e-st+1==k){
                if(count>maxcount){
                  maxcount=Math.max(maxcount,count);               
                }
               char sc=s.charAt(st);
            if(sc=='a' || sc=='e' || sc=='i'|| sc=='o'|| sc=='u') count--;
                st++;
                
            }
            e++;
        }
        return maxcount;
    }
}