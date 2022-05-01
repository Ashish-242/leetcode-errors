class Solution {
public:
    string removeDuplicateLetters(string s) {
       unordered_map<char,int> map;
        for(int i=0;i<s.length();i++){
          map[s[i]]=i;
        }
        
       vector<bool> arr(26,false);
        stack<char> st;
        if(st.empty()) st.push(s[0]);
        int x= s[0]-'a';
      arr[x]=true;
        for(int i=1;i<s.length();i++){
            
            if(arr[s[i]-'a']) continue;
            while(st.size() > 0 && (s[i]-'a') < (st.top()-'a') && map.at(st.top()) > i){
               arr[st.top()-'a']=false;
               st.pop();
            }
             st.push(s[i]);
               arr[s[i]-'a']=true;
             
            
        }
         string stt="";
            while(!st.empty()){
         cout<<st.top();
                stt+=st.top();
                st.pop();
            }
            reverse(stt.begin(),stt.end());
            
        return stt;
    }
};

//   vector<int> lastIndex(26, 0);
//         for (int i = 0; i < s.length(); i++){
//             lastIndex[s[i] - 'a'] = i; // track the lastIndex of character presence
//         }
        
//         vector<bool> seen(26, false); // keep track seen
//         stack<char> st;
        
//         for (int i = 0; i < s.size(); i++) {
//             int curr = s[i] - 'a';
//             if (seen[curr]) continue; // if seen continue as we need to pick one char only
//             while(st.size() > 0 && st.top() > s[i] && i < lastIndex[st.top() - 'a']){
//                 seen[st.top() - 'a'] = false; // pop out and mark unseen
//                 st.pop();
//             }
//             st.push(s[i]); // add into stack
//             seen[curr] = true; // mark seen
//         }
        
//         string ans = "";
//         while (st.size() > 0){
//             ans += st.top();
//             st.pop();
//         }
//         reverse(ans.begin(), ans.end());
//         return ans;
//     }

