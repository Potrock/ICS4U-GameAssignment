package battleship;

public class Gameboard implements I_Grid {
	public static int X1, Y1, X2, Y2;

	public Gameboard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '~';
			}
		}
	}

	public void updateBoard(char board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		new Play(board);
	}

}
