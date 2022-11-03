class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> map=new HashMap<>();
        int[] vis=new int[26];
        String[] arr=s.split(" ");
        if(arr.length!=pattern.length()) return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            if(!map.containsKey(arr[i])){
                if(vis[ch-'a']==0){
                    vis[ch-'a']=1;
                      map.put(arr[i],ch);
                }else{
                    return false;
                }
              
            }else{
                if(map.get(arr[i])!=ch){
                    return false;
                }
            }
        }
        return true;
    }
}