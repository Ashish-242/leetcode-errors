class Solution {
    public int countSubstrings(String s, String t) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                int x=i;
                int y=j;
                int diff=0;
                while(x<s.length() && y<t.length()){
                    if(s.charAt(x)!=t.charAt(y)){
                        diff++;
                    }
                    if(diff==1) {
//                         means both string differ by 1 character
                        count++;
                    }else if(diff==2){
                        break;
                    }
                    x++;
                    y++;
                }
            }
        }
        return count;
      
    }
}