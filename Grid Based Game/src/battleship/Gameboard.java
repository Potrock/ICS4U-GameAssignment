package battleship;

import java.util.Scanner;

public class Gameboard {
	private static final int BOARD_SIZE = 10;
	private int[][] board;
	private int shipCount = 0;
	private int userX1, userY1, userX2, userY2;
	public static int X1, Y1, X2, Y2;

	public Gameboard() {
		board = new int[BOARD_SIZE][BOARD_SIZE];
		placeShips();
	}

	private void placeShips() {
		System.out.println("Please place your ships");
		Scanner a = new Scanner(System.in);
		for (userX1 = a.nextInt(), userY1 = a.nextInt(), userX2 = a.nextInt(), userY2 = a
				.nextInt(); shipCount < 5; shipCount++) {
			if (userX1 - userX2 == shipCount && userY1 - userY2 == 0
					|| userY1 - userY2 == shipCount && userX1 - userX2 == 0) {
				X1 = userX1;
				Y1 = userY1;
				X2 = userX2;
				Y2 = userY2;
			}
		}
	}

	public static void main(String args[]) {
		Ship Carrier = new Ship("Carrier", 5, X1, Y1, X2, Y2);
		Ship Battleship = new Ship("Battleship", 4, X1, Y1, X2, Y2);
		Ship Destroyer = new Ship("Destroyer", 3, X1, Y1, X2, Y2);
		Ship Cruiser = new Ship("Cruiser", 2, X1, Y1, X2, Y2);
		Ship Submarine = new Ship("Submarine", 1, X1, Y1, X2, Y2);
	}

}
