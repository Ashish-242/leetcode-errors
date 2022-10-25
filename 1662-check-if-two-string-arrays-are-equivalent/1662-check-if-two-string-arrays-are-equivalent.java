class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String s:word1){
            s1+=s;
        }
        for(String s:word2){
            s2+=s;
        }
        
         int x= s1.compareTo(s2);
        return x==0?true:false;
    }
}