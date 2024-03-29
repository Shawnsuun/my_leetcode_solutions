class Solution {
    public boolean isValidSudoku(char[][] board) {
        //validate rows
        boolean[][] row = new boolean[9][9];
        //validate cols   
        boolean[][] col = new boolean[9][9];
        //validate blocks
        boolean[][] block = new boolean[9][9];

        //single time matrix traverse
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int blockIndex = i / 3 * 3 + j / 3;
                    if (row[i][num] || col[j][num] || block[blockIndex][num]) {
                        return false;
                    }
                    row[i][num] = true;
                    col[j][num] = true;
                    block[blockIndex][num] = true;
                }
            }
        }
        return true;
    }
}