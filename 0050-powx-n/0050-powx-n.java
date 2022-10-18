class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=-n;
            x=1/x;
        }
        return power(x,n);
    }
    public double power(double x,int n){
        if(n==0) return 1.0;
        if(n%2==0) return power(x*x,n/2);
        else return x*power(x*x,n/2);
    }
}