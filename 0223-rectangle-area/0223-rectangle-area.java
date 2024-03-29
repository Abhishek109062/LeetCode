class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = (ax2 - ax1)*(ay2 - ay1);
        int area2 = (bx2 - bx1)*(by2 - by1);
        int right = Math.min(ax2, bx2);
        int left = Math.min(Math.max(ax1, bx1), right);
        
        int top = Math.min(ay2, by2);
        int bottom = Math.min(Math.max(by1, ay1), top);
        
        return area1 - (top - bottom) * (right - left) + area2;
    }
}