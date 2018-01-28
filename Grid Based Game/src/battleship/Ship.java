package battleship;

public abstract class Ship {
	private String name;
	public int size;
	public boolean alive = true; // true for alive
	public int posX, posY;
	public int id = 1;
	public boolean[][] shipCheck = new boolean[10][10];

	public Ship() {
	}

	public abstract boolean hit(int shootX, int shootY); //removed char[][] board

	public String getShip(String name) {
		return this.name;
	}
	public String getShip(int id, String name) {
		return this.id + this.name;
	}

}
