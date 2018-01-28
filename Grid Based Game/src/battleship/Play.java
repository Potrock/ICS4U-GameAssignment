package battleship;

import java.util.Scanner;

public class Play extends Gameboard implements I_Grid {
	public int shootX;
	public int shootY;
	// Ship[] ships = {new Carrier(), new Battleship(), new Cruiser(), new Submarine(), new Destroyer() };
	Ship ships = new Submarine();
	
	public Play(char board[][]) {
		Scanner sc = new Scanner(System.in);
		shootX = sc.nextInt() - 1;
		shootY = sc.nextInt() - 1;
		shoot(shootX, shootY, board);
	}

	public void shoot(int i, int j, char board[][]) {
//		for (int k = 0; k < ships.length; k++) {
//			ships[k].hit(shootX, shootY, board);
//		}
//		for (int k = 0; k < ships.length; k++) {
//			if (ships[k].shipCheck[j][i]) {
//				board[j][i] = 'O';
//			}
//		}
		
		updateBoard(board);
	}

}
