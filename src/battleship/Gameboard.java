package battleship;

import ttt.I_CommonGame;

public class Gameboard implements I_CommonGame {
    // creates a string array to store the characters of the gameboard
    String[][] board = new String[BOARD_SIZE_Y][BOARD_SIZE_X];

    // sets the value of each position in the string array to a ~ character
    public Gameboard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "~";
            }
        }
    }

    public void initialize() {
        System.out.print("Welcome to Battleship!");
    }

}
