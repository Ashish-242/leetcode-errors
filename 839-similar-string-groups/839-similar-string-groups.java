class Solution {
    public int numSimilarGroups(String[] str) {
        HashSet<String> visited=new HashSet<>();
        int ans=0;

        for(String s:str){
            if(!visited.contains(s)){
                dfs(s,str,visited);
           
                ans++;
            }
        }
        return ans;
    }
    public void dfs(String s,String[] str,  HashSet<String> visited){
        if(visited.contains(s)) return;
        visited.add(s);
//         yaha pr hum s ke index se aage ki taraf nahi dekhenge kunki aisa krne pr ho sta h ki jese    a b c h to a c se match kr ra h pr a b se matchnahi kr ra to a apne ap ko or c ko visited mei dal kr or c pr call chli jaygi ab c ke aage walo index ke liye chlayenge to koi ni milega lekin hum yaha ye bhool gye ki c to match kr ra tha b se to agr hum starting se cal lgate hmesa to c starting se chalta or b ko bhi visited kr deta isliye hum starting se call krenge
//         agr hum bs forward call lgate index+1 se to b pr jb bat aati to use koi nimilta sath ka kyunki c pehle se hi set mei tha to wo alag componentho kr apne aap ko alag se add krwa lega
        for(int i=0;i<str.length;i++){
            if(issimiliar(s,str[i])){
                dfs(str[i],str,visited);
            }
        }
    }
    public boolean issimiliar(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
            if(count>2) return false;
        }
        return count<2 || count==2;
    }
}