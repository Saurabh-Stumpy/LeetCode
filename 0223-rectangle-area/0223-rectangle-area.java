class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int a = (ax2-ax1) * (ay2-ay1);
        int b = (bx2-bx1) * (by2-by1);
        
        int left = Math.max(ax1,bx1);
        int right = Math.min(ax2,bx2);
        int x = right -left;
        
        int top = Math.min(ay2,by2);
        int bottom = Math.max(ay1,by1);
        int y = top-bottom;
        
        if(x>0 && y>0) return a+b-(x*y);
        else return a+b;
        
        
        
    }
}