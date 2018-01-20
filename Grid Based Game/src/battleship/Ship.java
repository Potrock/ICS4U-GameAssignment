package battleship;

public abstract class Ship {
	public String name;
	public int size;
	public int lives;
	public int posX1, posY1, posX2, posY2;

	public Ship() {
	}

	public abstract void hit();

	public int getSize() {
		return this.lives;
	}

	public String getName() {
		return this.name;
	}

}
