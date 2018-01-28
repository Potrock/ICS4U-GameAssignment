package battleship;

public abstract class Ship {
	public String name;
	public int size;
	public boolean alive = true; // true for alive
	public int posX, posY; // posX2, posY2;
	public int id = 1;
	public boolean[][] shipCheck = new boolean[10][10];

	public Ship() {
	}

	public abstract void hit(int shootX, int shootY); //removed char[][] board

	public String getName() {
		return this.name;
	}

}
