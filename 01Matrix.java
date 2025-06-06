class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int c = mat[0].length;
        int[][] res = new int[m][c];
        int max = m + c;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == 0)
                    res[i][j] = 0;
                else
                    res[i][j] = max;
            }
        }       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < c; j++) {
                if (res[i][j] != 0) {
                    if (i > 0)
                        res[i][j] = Math.min(res[i][j], res[i - 1][j] + 1);
                    if (j > 0)
                        res[i][j] = Math.min(res[i][j], res[i][j - 1] + 1);
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = c - 1; j >= 0; j--) {
                if (res[i][j] != 0) {
                    if (i < m - 1)
                        res[i][j] = Math.min(res[i][j], res[i + 1][j] + 1);
                    if (j < c - 1)
                        res[i][j] = Math.min(res[i][j], res[i][j + 1] + 1);
                }
            }
        }

        return res;
    }
}
