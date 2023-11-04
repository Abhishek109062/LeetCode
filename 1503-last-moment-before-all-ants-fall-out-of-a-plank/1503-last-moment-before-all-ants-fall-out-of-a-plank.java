class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftmax = 0;
        int rightmin = n;
        for(int x = 0; x < left.length; x++)
            leftmax = Math.max(left[x], leftmax);
        
        for(int x = 0; x < right.length; x++)
            rightmin = Math.min(rightmin, right[x]);
        
        return Math.max(leftmax, n - rightmin);
    }
}