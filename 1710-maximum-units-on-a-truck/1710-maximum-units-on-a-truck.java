class Solution {
    public int maximumUnits(int[][] box, int T) {
        Arrays.sort(box,(a,b)->b[1]-a[1]);
       
      int ans = 0;
        for (int[] b : box) {
            int count = Math.min(b[0], T);
            ans += count * b[1];
            T -= count;
			if (T == 0) return ans;
        }
        return ans;
    }
}