package battleship;

public class Main implements I_Grid{

	public static void main(String[] args) {
		new Gameboard();
		new Play(board);
	}

}
