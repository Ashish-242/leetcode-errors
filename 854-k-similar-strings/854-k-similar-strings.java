class Solution {
    public int kSimilarity(String s1, String s2) {
        ArrayDeque<String> q=new ArrayDeque<>();
        HashSet<String> set=new HashSet<>();
        int k=0;
        q.add(s1);
        while(q.size()>0){
            int size=q.size();
            for(int i=0;i<size;i++){
//                 remove
                String rem=q.remove();
//                 mark
                if(set.contains(rem)){
                    continue;
                }
                
                set.add(rem);
//                 work
                if(rem.equals(s2)) return k;
                
                for(String s:getnbr(rem,s2)){
                    if(!set.contains(s)){
                        q.add(s);
                    }
                }
             
                
            }
               k++;
        }
        return -1;
    }
    public ArrayList<String> getnbr(String rem,String s2){
        ArrayList<String> res=new ArrayList<>();
        int idx=-1;
        for(int i=0;i<rem.length();i++){
            if(rem.charAt(i)!=s2.charAt(i)){
                idx=i;
                break;
            }
        }
        for(int j=idx+1;j<rem.length();j++){
            if(rem.charAt(j)==s2.charAt(idx)){
                String ss=swap(rem,j,idx);
                res.add(ss);
            }
        }
        return res;
    }

    public String swap(String rem,int j,int idx){
        StringBuilder sb=new StringBuilder(rem);
        char ch1=rem.charAt(idx);
        char ch2=rem.charAt(j);
        
        sb.setCharAt(idx,ch2);
        sb.setCharAt(j,ch1);
        return sb.toString();
        
        
    }
}