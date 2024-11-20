class Solution {
    public int takeCharacters(String s, int k) {
        //this is hard question , for this we do not think like dp or backtracking ,
        //this would be solved by sliding window,by reversing the approach
        //we have to take that character in window which we can subtract from total length
        //and still we have every character atleast k 
        //so instead of taking character from left and right we are inversing it and taking maximum
        //window length and subtract it from string length

//Count of all occurences
        int[] count=new int[3];
        for(char ch:s.toCharArray()){
            count[ch-'a']+=1;
        }

        if(Math.min(Math.min(count[0],count[1]),count[2])<k) return -1;

        //Sliding Window

        int l=0,res=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            count[s.charAt(r)-'a']--;
            while(Math.min(Math.min(count[0],count[1]),count[2])< k ){
                count[s.charAt(l)-'a']++;
                l++;

            }

            res=Math.min(res,s.length()-(r-l+1));
        }
        return res;
    }
}