class Solution {
    public int numSplits(String s) {
        int c=0;
      
             HashSet<Character>map1=new HashSet<>();
        HashSet<Character>map2=new HashSet<>();
      
        int[] arr1=new int[s.length()];
          int[] arr2=new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map1.add(ch);
            arr1[i]=map1.size();
        }
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            map2.add(ch);
            arr2[i]=map2.size();
        }
        
        for(int i=0;i<arr1.length-1;i++){
       
                if(arr2[i+1]==arr1[i]) {
                    System.out.print(1);
                    c++;
                
            }
        }
        return c;
    }
}