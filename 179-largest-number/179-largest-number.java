class Solution {
    public String largestNumber(int[] nums) {
        String[] s=new String[nums.length];
        int i=0;
        for(int val:nums){
            s[i]=Integer.toString(val);
            i++;
        }
       Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        if(s[0].equals("0")) return "0";
        StringBuilder sb=new StringBuilder();
       for(String ss:s){
           sb.append(ss);
       }
        return sb.toString();
       
    }
}