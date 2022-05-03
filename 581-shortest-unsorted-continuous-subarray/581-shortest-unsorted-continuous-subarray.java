class Solution {
    public int findUnsortedSubarray(int[] nums) {
             int end = -1;
          int start = 0;
      
        int max = nums[0];
     
          int min = nums[nums.length - 1];
        for(int i = 1,j=nums.length-2; i < nums.length; i++,j--){
            if(max > nums[i]){ // the left value is greater then current value
                end = i; // mark that index with end
            }
            else{
                max = nums[i];
            }
            
                if(min < nums[j]){ // the right value is smaller then current value
                start = j; // mark that index with start
                   
            }
            else{
                min = nums[j];
              
            }
        }
        
      
       
        return end - start + 1;
    }
    }
