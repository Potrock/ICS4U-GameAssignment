package battleship;

import java.util.Scanner;

public class Play extends Gameboard implements I_Grid {
	public int shootX;
	public int shootY;

	public Play() {
		Scanner sc = new Scanner(System.in);
		do {
			shootX = sc.nextInt() - 1;
			shootY = sc.nextInt() - 1;
		} while (shootX < 0 || shootX > 9 || shootY < 0 || shootY > 9);
		shoot(shootX, shootY);
	}

	public void shoot(int i, int j) {
		for (int k = 0; k < 5; k++) {
			if (!ship[k].hit(shootY, shootX)) {
				board[j][i] = "X";
			} else {
				board[j][i] = "O";
			}
		}
		for (int a = 0; a < board.length; a++) {
			for (int b = 0; b < board[a].length; b++) {
				System.out.print(board[a][b] + " ");
			}
			System.out.println();
		}
		new Play();
		updateBoard();
	}

}
