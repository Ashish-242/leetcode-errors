class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        Arrays.sort(strs,(a,b)-> a.length()-b.length());
        String longestprefix="-1";
        int i=0;
        while(i<strs.length-1){
            String first=strs[i];
            String second=strs[i+1];
            String calulatelongestprefix=solve(first,second);
           System.out.println(calulatelongestprefix);
            if(longestprefix=="-1" || calulatelongestprefix.length() <= longestprefix.length()){
                longestprefix=calulatelongestprefix;
            }
            i++;
        }
        return longestprefix;
    }
    public String solve(String a,String b){
        int i=0,j=0;
        int len=a.length()>b.length()?b.length():a.length();
        while(i<len && j<len){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }else{
                return a.substring(0,i);
            }
        }
        if(i>0 && (i<=b.length() || i<=a.length())) return a.substring(0,i);
        return "";
    }
}