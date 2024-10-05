class Solution {
    public boolean checkInclusion(String s1, String s2) {
        s1=sort(s1);
        for(int i=0;i<=s2.length()-s1.length();i++){
            String sub=s2.substring(i,i+s1.length());
            sub=sort(sub);
            if(sub.equals(s1)) return true;
        }
    return false;
    }
    public String sort(String s1){
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}