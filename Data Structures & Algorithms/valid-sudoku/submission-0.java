class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> nonDuplicate = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (nonDuplicate.contains(board[i][j])) return false;
                nonDuplicate.add(board[i][j]);
            }
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> nonDuplicate = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                if (nonDuplicate.contains(board[j][i])) return false;
                nonDuplicate.add(board[j][i]);
            }
        }

        for (int square = 0; square < 9; square++) {
            Set<Character> nonDuplicate = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (nonDuplicate.contains(board[row][col])) return false;
                    nonDuplicate.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
