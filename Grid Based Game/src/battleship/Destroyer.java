package battleship;

public class Destroyer extends Ship {

	public Destroyer(int posX1, int posY1, int posX2, int posY2) {
		this.name = "Destroyer";
		this.size = 3;
		this.lives = 3;
		this.posX1 = posX1;
		this.posY1 = posY1;
		this.posX2 = posX2;
		this.posY2 = posY2;
	}

	@Override
	public void hit() {
		// TODO Auto-generated method stub

	}

}
