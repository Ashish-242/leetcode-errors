class Solution {
    public int minimumLength(String s) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char c:map.keySet()){
            int value=map.get(c);
            if(value%2==0) count+=2;
            else count+=1;
        }
        return count;
    }
}