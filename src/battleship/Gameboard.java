package battleship;

public class Gameboard implements I_Grid {
    public String[][] board = new String[BOARD_SIZE_Y][BOARD_SIZE_X];

    public Gameboard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "~";
            }
        }
    }

}