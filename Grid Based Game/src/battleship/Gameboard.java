package battleship;

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
		new Play();
	}

}
