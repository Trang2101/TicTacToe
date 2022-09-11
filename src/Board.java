public class Board {
    public int[][] board = new int[3][3];

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| ");
                if (this.board[i][j] == 0) {
                    System.out.print("  ");
                } else if (this.board[i][j] == 1) {
                    System.out.print("X ");
                } else if (this.board[i][j] == 2) {
                    System.out.print("O ");
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public boolean isFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean isWin() {
        boolean verticalCheck = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[i][0] != 0 && this.board[i][0] == this.board[i][j]) {
                    verticalCheck = true;
                } else {
                    verticalCheck = false;
                    break;
                }
            }
            if (verticalCheck) {
                if (this.board[i][0] == 1) {
                    System.out.println("Player1 win!");
                } else {
                    System.out.println("Player2 win!");
                }
                return true;
            }
        }

        boolean horizontalCheck = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (this.board[0][i] != 0 && this.board[0][i] == this.board[j][i]) {
                    horizontalCheck = true;
                } else {
                    horizontalCheck = false;
                    break;
                }
            }
            if (horizontalCheck) {
                if (this.board[0][i] == 1) {
                    System.out.println("Player1 win!");
                } else {
                    System.out.println("Player2 win!");
                }
                return true;
            }
        }

        if (this.board[0][0] != 0 && this.board[0][0] == this.board[1][1] && this.board[0][0] == this.board[2][2]) {
            if (this.board[0][0] == 1) {
                System.out.println("Player1 win!");
            } else {
                System.out.println("Player2 win!");
            }
            return true;
        }

        if (this.board[0][2] != 0 && this.board[0][2] == this.board[1][1] && this.board[0][2] == this.board[2][0]) {
            if (this.board[0][2] == 1) {
                System.out.println("Player1 win!");
            } else {
                System.out.println("Player2 win!");
            }
            return true;
        }

        return false;
    }
}
