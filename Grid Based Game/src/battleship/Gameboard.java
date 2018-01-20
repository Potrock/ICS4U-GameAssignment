package battleship;

import java.util.Scanner;

public class Gameboard implements I_Grid {
	private int shipCount = 0;
	private int userX1, userY1, userX2, userY2;
	public static int X1, Y1, X2, Y2;

	public Gameboard() {
		System.out.println("Please place your ships");
		Scanner sc= new Scanner (System.in);
		userX1 = userY1 = userX2 = userY2 = sc.nextInt();
		placeShips(userX1, userY1, userX2, userY2);
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = '~';
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public void placeShips(int userX1, int userY1, int userX2, int userY2) {
		for (; shipCount < 5; shipCount++) {
			if (userX1 - userX2 == shipCount && userY1 - userY2 == 0
					|| userY1 - userY2 == shipCount && userX1 - userX2 == 0) {
				X1 = userX1;
				Y1 = userY1;
				X2 = userX2;
				Y2 = userY2;
			}
		}
	}

}
