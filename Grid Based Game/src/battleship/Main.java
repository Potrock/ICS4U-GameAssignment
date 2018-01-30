package battleship;

public class Main implements I_Grid {

	public static void main(String[] args) {
		System.out.println("Kill the ship to win!");
		System.out.println("Please input coordinates for a shot using integers");
		new Gameboard();
		new Play();
	}

}
