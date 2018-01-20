package battleship;

import java.util.Scanner;

public class Player extends Gameboard {
	public int playerTurn; // 1= p1, 2 = p2
	
	public void shoot(int i, int j) {
		if (board[i][j] == '~') {
			board[i][j] = 'O';
		}
		else {
			System.out.println("Please choose a different coordinate");
		}
	}

}
