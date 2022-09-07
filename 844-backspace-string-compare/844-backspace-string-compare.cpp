// class Solution {
// public:
//     bool backspaceCompare(string s, string t) {
//         stack<char>st;
//         stack<char> st2;
//         for(int i =0;i<s.length();i++){
//             if(s[i]!='#') st.push(s[i]);
//             if(s[i]=='#' && !st.empty()) st.pop();
//         }
//         for(int i =0;i<t.length();i++){
//             if(t[i]!='#') st2.push(t[i]);
//             if(t[i]=='#' && !st2.empty())  st2.pop();
//         }
        
//         if(st.size()!=st2.size()) return false;
       
//         while(!st.empty()){
//             if(st.top() != st2.top()) return false;
//             else if((st.size()!=0 && st2.size()==0) || (st.size()==0 && st2.size()!=0)) return false;
//             else{
//                 st.pop();
//                 st2.pop();
//             }
//         }
//         return true;
//     }
// };

class Solution {
public:
    bool backspaceCompare(string s, string t) {
        stack<char>st;
        stack<char> st2;
        for(int i =0;i<s.length();i++){
            if(s[i]!='#') st.push(s[i]);
            if(s[i]=='#' && !st.empty())  st.pop();
        }
        for(int i =0;i<t.length();i++){
            if(t[i]!='#' ) st2.push(t[i]);
            if(t[i]=='#' && !st2.empty())  st2.pop();
        }
         if(st.size()!=st2.size()) return false;
        while(!st.empty()){
             // if(st.size()!=st2.size()){ return false;
      
        // } 
          if(st.top() != st2.top() ) return false;
            // else if((st.size()!=0 && st2.size()==0) || (st.size()==0 && st2.size()!=0)) return false;
            else{
                st.pop();
                st2.pop();
            }
        }
        return true;
    }

};
