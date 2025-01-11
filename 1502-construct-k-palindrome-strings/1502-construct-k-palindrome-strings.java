class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        if(k>n) return false;
        int oddcount=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char c:map.keySet()){
            int val=map.get(c);
            if((val%2)!=0) oddcount+=1;
        }
        if(oddcount>k) return false;
        return true;
    }
}