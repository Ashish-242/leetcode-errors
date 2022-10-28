class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        char sign='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=(num*10)+(s.charAt(i)-'0');
                    i++;
                }
            i--;
            if(sign=='+'){
                st.push(num);
            }else  if(sign=='-'){
                st.push(-num);
            }
            else  if(sign=='*'){
                st.push(st.pop()*num);
            }
                else if(sign=='/'){
                st.push(st.pop()/num);
                }   
            }
            else if(ch=='+'){
                sign='+';
            }else  if(ch=='-'){
                sign='-';
            }
            else  if(ch=='*'){
                sign='*';
            }else if(ch=='/'){
                sign='/';
            }
            else{
                continue;
            }
        }
        
        int sum=0;
        while(st.size()>0){
            sum+=st.pop();
        }
        return sum;
         }
    }
