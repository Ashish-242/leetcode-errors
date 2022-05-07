class Solution {
    public boolean find132pattern(int[] nums) {
 int len = nums.length;
        if (len < 3) {
            return false;
        }

        TreeMap<Integer, Integer> rightMap = new TreeMap<>();
        for (int i = 2; i < len; i++) {
            rightMap.put(nums[i], rightMap.getOrDefault(nums[i], 0) + 1);
        }

        int leftMin = nums[0];
        for (int j = 1; j < len - 1; j++) {
            if (leftMin < nums[j]) {
                Integer numK = rightMap.ceilingKey(leftMin + 1);
                if (numK != null && numK < nums[j]) {
                    return true;
                }
            }

            leftMin = Math.min(leftMin, nums[j]);
            rightMap.put(nums[j + 1], rightMap.get(nums[j + 1]) - 1);
            if (rightMap.get(nums[j + 1]) == 0) {
                rightMap.remove(nums[j + 1]);
            }
        }

        return false;
    }
}