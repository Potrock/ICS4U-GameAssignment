package battleship;

public class Submarine extends Ship {

	public Submarine() {
		int userX = 10*(int) Math.random();
		int userY = 10*(int) Math.random();
		this.posX = userX;
		this.posY = userY;
		this.shipCheck[this.posY][this.posX] = true;
		this.name = this.id + "Submarine";
		this.size = 1;
	}

	@Override
	public void hit(int shootX, int shootY) { // removed char[][] board
		if (this.shipCheck[this.posY][this.posX])
			this.id = 0;
	}

}
