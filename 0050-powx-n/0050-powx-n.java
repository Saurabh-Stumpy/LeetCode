class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long l = n;

        if(n<0) l = -1*l;

        while (l>0){
            if(l%2!=0){
                ans = ans * x;
                l=l-1;
            }
            else{
                x =x*x;
                l=l/2;
            }
        }
        if (n<0) ans = (double) 1.0/ans;
        return ans;
    }
}