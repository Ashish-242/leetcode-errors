class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map=new HashMap<>();
      
        Integer[] arr1=new Integer[heights.length];
        for(int i=0;i<heights.length;i++){
            arr1[i]= Integer.valueOf(heights[i]);
        }
          for(int i=0;i<names.length;i++){
            map.put(arr1[i],names[i]);
        }
        Arrays.sort(arr1,Collections.reverseOrder());
       
        String[] arr=new String[heights.length];
        for(int j=0;j<arr1.length;j++){
            arr[j]=map.get(arr1[j]);
        }
        return arr;
    }
}