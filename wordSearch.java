class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtrack(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    boolean backtrack(char[][] board, String word, int i, int j, int temp) {
        if (temp == word.length())
            return true;

        if (i < 0 || j < 0 || i > board.length - 1 || j > board[0].length - 1 || board[i][j] != word.charAt(temp))
            return false;

        char tem = board[i][j];
        board[i][j] = '*';
        boolean found = backtrack(board, word, i + 1, j, temp + 1) || backtrack(board, word, i - 1, j, temp + 1)
                || backtrack(board, word, i, j + 1, temp + 1) || backtrack(board, word, i, j - 1, temp + 1);
        board[i][j] = tem;

        return found;

    }
}
