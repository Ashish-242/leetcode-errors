class Solution {
    public static  void Sort2DArrayBasedOnColumnNumber (int[][] intervals, final int columnNumber){
        Arrays.sort(intervals, new Comparator<int[]>() {
      
            public int compare(int[] first, int[] second) {
               if(first[columnNumber-1] > second[columnNumber-1]) return 1;
                else if(first[columnNumber-1]< second[columnNumber-1])return -1;
               else return 0;
            }
        });
    }
    public int[][] merge(int[][] arr) {
        Sort2DArrayBasedOnColumnNumber(arr,1);
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int pmax=arr[0][1];
        int pmin=arr[0][0];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
     
        for(int i=1;i<arr.length;i++){
            
            if( pmax >= arr[i][0]) pmax=Math.max(pmax,arr[i][1]);
            else {
                list.add(new ArrayList<>(Arrays.asList(pmin,pmax)));
                pmin=arr[i][0];
                pmax=arr[i][1];
            }
            
        }
          list.add(new ArrayList<>(Arrays.asList(pmin,pmax)));
        int[][] d=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            for(int j=0;j<2;j++){
                d[i][j]=list.get(i).get(j);
            }
        }
        return d;
    }
}




