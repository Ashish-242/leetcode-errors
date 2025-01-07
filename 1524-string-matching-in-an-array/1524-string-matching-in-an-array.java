class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans=new ArrayList<String>();
        Arrays.sort(words,(a,b)->a.length()-b.length());
        
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
               
                    String s2=words[j];
                    String s1=words[i];
                    if(s2.length() > s1.length()){
                        if(s2.contains(s1)) {
                            ans.add(s1);
                            break;
                        }
                    
                }
            }
        }
        return ans;
    }
}