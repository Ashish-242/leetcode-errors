class Solution {
    public String removeDuplicateLetters(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
      map.put(s.charAt(i),i);
        }
        
      boolean[] arr = new boolean[26];
        Stack<Character> st=new Stack<>();
        if(st.isEmpty()) st.push(s.charAt(0));
        int x= s.charAt(0)-'a';
      arr[x]=true;
        for(int i=1;i<s.length();i++){
            
            if(arr[s.charAt(i)-'a']) continue;
            while(st.size() > 0 && (s.charAt(i)-'a') < (st.peek()-'a') && map.get(st.peek()) > i){
               arr[st.peek()-'a']=false;
               st.pop();
            }
             st.push(s.charAt(i));
               arr[s.charAt(i)-'a']=true;
             
            
        }
         StringBuilder stt=new StringBuilder();
            while(!st.empty()){
        
                stt.append(st.pop());
            
            }
       return stt.reverse().toString();
            
     
    }
}

//   int[] lastIndex = new int[26];
//         for (int i = 0; i < s.length(); i++){
//             lastIndex[s.charAt(i) - 'a'] = i; // track the lastIndex of character presence
//         }
        
//         boolean[] seen = new boolean[26]; // keep track seen
//         Stack<Integer> st = new Stack();
        
//         for (int i = 0; i < s.length(); i++) {
//             int curr = s.charAt(i) - 'a';
//             if (seen[curr]) continue; // if seen continue as we need to pick one char only
//             while (!st.isEmpty() && st.peek() > curr && i < lastIndex[st.peek()]){
//                 seen[st.pop()] = false; // pop out and mark unseen
//             }
//             st.push(curr); // add into stack
//             seen[curr] = true; // mark seen
//         }

//         StringBuilder sb = new StringBuilder();
//         while (!st.isEmpty())
//             sb.append((char) (st.pop() + 'a'));
//         return sb.reverse().toString();