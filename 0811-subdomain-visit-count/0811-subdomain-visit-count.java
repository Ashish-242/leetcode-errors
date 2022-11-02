class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(String s: cpdomains ){
            String[] s1=s.split(" ");
           
            int x=Integer.parseInt(s1[0]);
           
           
            String[] s2=s1[1].split("\\.");
           
            String sn="";
            for(int i=s2.length-1;i>=0;i--){
                 sn=s2[i]+sn;
                    
                map.put(sn,map.getOrDefault(sn,0)+x);
                sn="." +sn;
            }
        }
      
        for(String ss:map.keySet()){
            StringBuilder sb=new StringBuilder(Integer.toString(map.get(ss)));
          
            sb.append(" ");
          sb.append(ss);
            res.add(sb.toString());
        }
        return res;
    }
}