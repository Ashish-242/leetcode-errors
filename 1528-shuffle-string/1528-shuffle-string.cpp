class Solution {
public:
    string restoreString(string s, vector<int>& arr) {
            int n=s.size();
        int x=0;
     string ss=s;
        for(int i=0;i<arr.size();i++){
     ss[arr[i]]=s[i];
        }
        return ss;
        
    }
};