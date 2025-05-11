class Solution {
    public List<String> restoreIpAddresses(String s) {
          List<String> list=new ArrayList<String>();
           List<String> l=new ArrayList<String>();
        solve(s,0,list,l);
        return list;
    }
     public void solve(String s,int i, List<String> list,List<String> l){
        if(i>s.length()) return;
        if(l.size()==4 && i==s.length() ){  
        list.add(String.join(".",l));         
        }
        else{
             for(int j=i+1;j<=i+3;j++){
            if(j<=s.length()){
                 String ss=s.substring(i,j);
           if(Integer.parseInt(ss) <256 && (ss.equals("0") || !ss.startsWith("0") )){
            l.add(ss);
               solve(s,j,list,l);
               l.remove(l.size()-1);
           }
        }
           
           
        }
        }
       
        
    }

}