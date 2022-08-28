class Solution {
   public int[][] diagonalSort(int[][] A) {
    int m = A.length, n = A[0].length;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < (i>0?1:n); j++) {
            Stack<Integer> vals = new Stack<>();
            while (i<m && j<n)
                vals.add(A[i++][j++]);
            Collections.sort(vals);
            while (i > 0 && j > 0)
                A[--i][--j] = vals.pop();
        }
    }
    return A;
   }
}