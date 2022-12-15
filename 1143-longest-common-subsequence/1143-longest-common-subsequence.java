class Solution {
    public int lcsRecursive(String s, String t, int i, int j) {
        if (i >= s.length() || j >= t.length()) {
            return 0;
        }
        
        if (s.charAt(i) == t.charAt(j)) {
            return lcsRecursive(s, t, i+1, j+1) + 1;
        } else {
            int a = lcsRecursive(s, t, i+1, j);
            int b = lcsRecursive(s, t, i, j+1);
            return Math.max(a, b);
        }
    }
    
    private int[][] m;
    public int lcsMemoize(String s, String t, int i, int j) {
        if (i >= s.length() || j >= t.length()) {
            return 0;
        }
        
        int tmp = m[i][j];
        if (tmp > 0) {
            return tmp-1;
        }
        
        int r;
        if (s.charAt(i) == t.charAt(j)) {
            r = lcsMemoize(s, t, i+1, j+1) + 1;
        } else {
            int a = lcsMemoize(s, t, i+1, j);
            int b = lcsMemoize(s, t, i, j+1);
            r = Math.max(a, b);
        }
        m[i][j] = r+1;
        return r;
    }
    
    public int lcsDynamic(String s, String t) {
        int[][] m = new int[s.length() +1][t.length() +1];
        for (int i=s.length()-1; i>=0; i--) {
            for (int j=t.length()-1; j>=0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    m[i][j] = m[i+1][j+1] + 1;
                } else {
                    m[i][j] = Math.max(m[i+1][j], m[i][j+1]);
                }
            }
        }
        return m[0][0];
    }
    
    public int lcsDynamicOpt(String s, String t) {
        int[] r0 = new int[t.length() + 1];
        int[] r1 = new int[t.length() + 1];
        for (int i=s.length()-1; i>=0; i--) {
            for (int j=t.length()-1; j>=0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    r0[j] = r1[j+1] + 1;
                } else {
                    r0[j] = Math.max(r1[j], r0[j+1]);
                }
            }
            int[] tmp = r0;
            r0 = r1;
            r1 = tmp;
        }
        return r1[0];
    }
	
    public int longestCommonSubsequence(String s, String t) {
        //return lcsRecursive(s, t, 0, 0);
        
        //m = new int[s.length()][t.length()];
        //return lcsMemoize(s, t, 0, 0);
        
        //return lcsDynamic(s, t);
		return lcsDynamicOpt(s, t);
    }
}