class Solution {
public:
    int countDaysTogether(string a, string b, string c, string d) {
          map<int,int> mp{{1,31},{2,28},{3,31},{4,30},{5,31},{6,30},{7,31},{8,31},{9,30},{10,31},{11,30},{12,31}};
        int ans = 0;
        
        set<pair<int,int>> vp;
                
        int alice_a_month = stoi(a.substr(0,2)), alice_a_date = stoi(a.substr(3));
        int alice_l_month = stoi(b.substr(0,2)), alice_l_date = stoi(b.substr(3));
        int bob_a_month = stoi(c.substr(0,2)), bob_a_date = stoi(c.substr(3));
        int bob_l_month = stoi(d.substr(0,2)), bob_l_date = stoi(d.substr(3));
        
        for(int i=alice_a_month;i<=alice_l_month;i++){
            int st_date = i == alice_a_month ? alice_a_date : 1;
            int lim = i == alice_l_month ? alice_l_date : mp[i];
            
            for(int j=st_date;j<=lim;j++)
                vp.insert({i,j});
        }
        
        for(int i=bob_a_month;i<=bob_l_month;i++){
            int st_date = i == bob_a_month ? bob_a_date : 1;
            int lim = i == bob_l_month ? bob_l_date : mp[i];
            
            for(int j=st_date;j<=lim;j++)
                if(vp.count({i,j})) ans++;
        }
        
        
        return ans;
    }
};