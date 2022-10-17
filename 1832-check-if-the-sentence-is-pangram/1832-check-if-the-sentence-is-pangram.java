class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:sentence.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<26;i++){
            char c=(char)(i+'a');
            if(!map.containsKey(c)) return false;
        }
        return true;
    }
}