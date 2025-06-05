class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] res = new int[rows * cols];
        int r = 0;
        int c = 0;
        for (int i = 0; i < rows * cols; i++) {
          res[i] = mat[r][c];
          if ((r + c) % 2 == 0) {
            if (r - 1 >= 0 && c + 1 < cols) {
              c = c + 1;
              r = r - 1;
            } else if (r - 1 < 0 && c + 1 < cols) {
              c = c + 1;
            } else if (r + 1 < rows && c + 1 > cols - 1) {
              r = r + 1;
            }
          }
          else if ((r + c) % 2 != 0) {
            if (r + 1 < rows && c - 1 >= 0) {
              c = c - 1;
              r = r + 1;
            } else if (r + 1 < rows && c - 1 < 0) {
              r = r + 1;
            } else if (r + 1 > rows - 1 && c +1 < cols) {
              c = c + 1;
            }
          }
        }
        return res;
    }
    }
