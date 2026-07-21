// Last updated: 21/07/2026, 23:15:13
class Solution {

    public boolean isSafe(char[][] board, int row, int col, char c) {
        int m=board.length;
         for (int i = 0; i < m; i++) {
            if (board[i][col] == c) return false;
        }

        // Check current row for duplicates
        for (int j = 0; j < m; j++) {
            if (board[row][j] == c) return false;
        }

        // Find start of 3x3 sub-box
        int boxRowStart = 3 * (row / 3);
        int boxColStart = 3 * (col / 3);

        // Check 3x3 box for duplicates
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[boxRowStart + i][boxColStart + j] == c) return false;
            }
        }

        // No conflicts, placement is valid
        return true;
    }

    public boolean solve(char[][] board){
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='.'){
                    for(char num='1'; num<='9'; num++){
                        if(isSafe(board,i,j,num)){
                            board[i][j]=num;

                            if(solve(board)) return true;

                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}
