class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxarea=Integer.MIN_VALUE;
        while(j>i){
            int area=Math.abs((j-i)*Math.min(height[i],height[j]));
            if(height[i]> height[j]) j--;
            else i++;
            if(area>maxarea)
            maxarea=Math.max(maxarea,area);

        }
        return maxarea;
    }
}