class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
        int mx=Integer.MIN_VALUE;
        int i=0;
        int j=-1;
       
        for(i=0;i<s.length();i++){
            
           
       mx=Math.max(mx,map.get(s.charAt(i)));
            
            if(i==mx){
                ans.add(mx - j);
                j=mx;
                
            }
        }
        return ans;
    }
}