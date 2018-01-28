package battleship;

import java.util.Arrays;

public class Gameboard implements I_Grid {
	Ship[] ship = {new Submarine(), new Submarine(), new Submarine(), new Submarine(), new Submarine() };

	public Gameboard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = "~";
			}
		}
	}

	public void updateBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		new Play();
	}

}
