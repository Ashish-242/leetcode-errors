class Solution {
    public int minMutation(String start, String end, String[] bank) {
     Queue<String> q=new LinkedList<>();
       List<String> l=Arrays.asList(bank);
        HashSet<String> set=new HashSet<>();
        q.add(start);
        set.add(start);
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                String s=q.poll();
                if(s.equals(end)){
                    return count;
                }
                char[] curr=s.toCharArray();
                for(int i=0;i<8;i++){
                    char original=curr[i];
                    for(char ch:"ACGT".toCharArray()){
                        curr[i]=ch;
                        String snew=new String(curr);
                        if(!set.contains(snew) && l.contains(snew)){
                            q.add(snew);
                            set.add(snew);
                        }
                    }
                    curr[i]=original;
                }
            }
            count++;
        }
        
        return -1;
    }
}