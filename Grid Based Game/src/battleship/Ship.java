package battleship;

public abstract class Ship {
	private String name;
	public boolean alive = true; // true for alive
	public int posX, posY;
	public int id = 1;
	public boolean[][] shipCheck = new boolean[5][5];

	public Ship() {
	}

	public abstract boolean hit(int shootX, int shootY);

	public String getShip(String name) {
		return this.name;
	}

}
