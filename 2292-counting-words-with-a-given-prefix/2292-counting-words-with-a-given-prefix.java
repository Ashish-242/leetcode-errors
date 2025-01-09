class Solution {
    public int prefixCount(String[] words, String pref) {
        int count =0;
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            if(s.length()>=pref.length()){
                 String s1=s.substring(0,pref.length());
                 
                if(pref.equals(s1))
                {
                   count=count+1; 
                }   
            }
               
        }
        return count;
    }
}