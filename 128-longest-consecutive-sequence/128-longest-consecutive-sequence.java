class Solution {
     int count=1;
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
       
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int count=0;
        int longest=1;
    for(int i=0;i<nums.length;i++){
        int x=nums[i];
        int y=x-1;
        int z=x+1;
        count=1;
//         left
        while(set.contains(y)){
            count++;
            set.remove(y);
            y=y-1;
            
        }
//         right
        while(set.contains(z)){
            count++;
            set.remove(z);
            z=z+1;
        }
        longest=Math.max(longest,count);
    }
        return longest;
     
    }
   
}