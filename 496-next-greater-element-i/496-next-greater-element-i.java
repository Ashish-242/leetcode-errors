class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>map=new HashMap<>();
        Stack<Integer> st = new Stack<>();
        st.push(nums2[nums2.length-1]);
        map.put(nums2[nums2.length-1],-1);
        for(int i=nums2.length-2;i>=0;i--){
              
            while(!st.empty()  && nums2[i] >=st.peek()){
                st.pop();
            }
           
              if(st.size()==0){
                   st.push(nums2[i]);
                   map.put(nums2[i],-1);
                nums2[i]=-1;
                 
               
            } 
        else if(nums2[i] < st.peek()){
             map.put(nums2[i],st.peek());
              st.push(nums2[i]);
           
                nums2[i]=st.peek();
              
            }else {
            st.push(nums2[i]);
                nums2[i]=0;
            }
           
        }
        
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }
        }
        
        return nums1;
        }
    }
