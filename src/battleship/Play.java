package battleship;

import ttt.I_CommonGame;

import java.util.Scanner;

public class Play extends Gameboard implements I_CommonGame {
    private int shootX;
    private int shootY;

    public Play() {
        Scanner sc = new Scanner(System.in);
        do {
            shootX = sc.nextInt() - 1;
            shootY = sc.nextInt() - 1;
        } while (shootX < 0 || shootX > 4 || shootY < 0 || shootY > 4);
        shoot(shootX, shootY);
    }

    private void shoot(int i, int j) {
        if (!ship.hit(j, i)) {
            board[j][i] = "X";
        } else {
            board[j][i] = "O";
        }
        for (int a = 0; a < board.length; a++) {
            for (int b = 0; b < board[a].length; b++) {
                System.out.print(board[a][b] + " ");
            }
            System.out.println();
        }
        ((Submarine) ship).hit();
    }

}