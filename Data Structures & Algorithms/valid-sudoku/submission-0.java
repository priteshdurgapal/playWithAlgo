class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];   // rows[r][d]  -> digit d+1 seen in row r
        boolean[][] cols = new boolean[9][9];   // cols[c][d]
        boolean[][] boxes = new boolean[9][9];  // boxes[b][d]

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue;

                int d = ch - '1';                   // map '1'..'9' -> 0..8
                int b = (r / 3) * 3 + (c / 3);

                if (rows[r][d] || cols[c][d] || boxes[b][d]) return false;

                rows[r][d] = cols[c][d] = boxes[b][d] = true;
            }
        }
        return true;
    }
}