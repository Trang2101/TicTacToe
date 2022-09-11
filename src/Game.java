import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Board board = new Board();
        board.printBoard();
        Scanner scanner = new Scanner(System.in);
        boolean playerX = true;
        boolean playerY = false;
        boolean play = true;
        while (play) {
            int x, y;
            boolean hople = false;
            if (playerX) {
                System.out.print("Player 1: ");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
                if (x < 3 && y < 3) {
                    if (board.board[x][y] == 0 ) {
                        board.board[x][y] = 1;
                        hople = true;
                    } else {
                        System.out.println("Error!");
                    }
                } else {
                    System.out.println("Error!");
                }
            }
            if (playerY) {
                System.out.print("Player 2: ");
                x = scanner.nextInt() - 1;
                y = scanner.nextInt() - 1;
                if (x < 3 && y < 3) {
                    if (board.board[x][y] == 0) {
                        board.board[x][y] = 2;
                        hople = true;
                    } else {
                        System.out.println("Error!");
                    }
                } else {
                    System.out.println("Error!");
                }
            }
            if (hople) {
                playerX = !playerX;
                playerY = !playerY;
            }
            board.printBoard();
            if (board.isFull()) {
                play = false;
            }
            if (board.isWin()) {
                play = false;
            }
        }
    }
}
