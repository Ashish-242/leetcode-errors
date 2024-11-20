class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] ans=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        Stack<Integer> greatertemp=new Stack<>();
        for(int i=temp.length-1;i>=0;i--){
            int num=temp[i];
            if(st.isEmpty()){
                st.add(num);
                greatertemp.add(0);
                ans[i]=0;
            }
            else if(st.peek() > num){
                st.add(num);
                greatertemp.add(1);
                ans[i]=1;
            }else if(st.peek() <= num){
                int sum=1;
                while(!st.isEmpty() && st.peek()<=num){
                    st.pop();
                    sum+=greatertemp.pop();
                }
                    if(st.isEmpty()){
                     greatertemp.add(0);
                ans[i]=0;
                }else{
                    greatertemp.add(sum);
                ans[i]=sum;
                }
                st.add(num);
            
                
            }else{
                st.add(num);
                greatertemp.add(0);
            }
        }
        return ans;
    }
}