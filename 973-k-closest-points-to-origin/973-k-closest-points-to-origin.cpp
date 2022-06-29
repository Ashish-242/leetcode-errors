class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
             priority_queue<pair<int,vector<int>>> pq;
      

        for(vector<int> it:points){
//             auto works like we want what type of data type it automitacally determine the data type and give us
            int x= (it[0] * it[0]) + (it[1] * it[1]);
            pq.push({x,it});
            if(pq.size()>k) pq.pop();
        }
      vector<vector<int>> res;
        
       while(pq.size()>0){
       
           auto t=pq.top();
           pq.pop();
          res.push_back(t.second);
          
           
       }
     return res;
    }
};