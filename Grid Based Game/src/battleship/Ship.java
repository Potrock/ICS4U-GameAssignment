package battleship;

public class Ship {
	private final String name;
	private final int size;
	private int lives;
	public int posX1, posY1, posX2, posY2;

	public Ship(String name, int size, int posX1, int posY1, int posX2, int posY2) {
		this.name = name;
		this.size = size;
		this.lives = size;
		this.posX1 = posX1;
		this.posY1 = posY1;
		this.posX2 = posX2;
		this.posY2 = posY2;
	}

	public void hit() {
		if (/*bullet*/ == posX1 && posY1 || /*bullet*/) {
			
		}
	}

	public int getSize() {
		return this.lives;
	}

	public String getName() {
		return this.name;
	}

}
