class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int totalCost=0;
        while(homePos[0]!=startPos[0]){
            if(homePos[0] > startPos[0]){
                totalCost+=rowCosts[startPos[0] +1];
                startPos[0]+=1;
            }else{
                totalCost+=rowCosts[startPos[0]-1];
                startPos[0]-=1;
            }
        }
           while(homePos[1]!=startPos[1]){
            if(homePos[1] > startPos[1]){
                totalCost+=colCosts[startPos[1] +1];
                startPos[1]+=1;
            }else{
                totalCost+=colCosts[startPos[1]-1];
                startPos[1]-=1;
            }
        }
        return totalCost;
    }
}