class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        // Calculate first rectangle square
        int firstRectSq = (ax2 - ax1) * (ay2 - ay1);

        // Calculate second rectangle square
        int secondRectSq = (bx2 - bx1) * (by2 - by1);

        // Calculate intersection rectangle square
        int ix1 = 0, ix2 = 0;
        if (bx1 < ax2 && bx2 > ax1) {
            // There is intersection by x
            ix1 = Math.max(ax1, bx1);
            ix2 = Math.min(ax2, bx2);
        }
        int iy1 = 0, iy2 = 0;
        if (by1 < ay2 && by2 > ay1) {
            // There is intersection by y
            iy1 = Math.max(ay1, by1);
            iy2 = Math.min(ay2, by2);
        }
        int intersectionRectSq = (ix2 - ix1) * (iy2 - iy1);

        return firstRectSq + secondRectSq - intersectionRectSq;    
    }
}