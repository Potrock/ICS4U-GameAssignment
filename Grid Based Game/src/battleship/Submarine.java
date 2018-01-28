package battleship;

public class Submarine extends Ship {

	public Submarine() {
		int userX = (int)(10*Math.random());
		int userY = (int)(10*Math.random());
		this.posX = userX;
		this.posY = userY;
		this.shipCheck[this.posY][this.posX] = true;
		this.id++;
		this.getShip(this.id, "Submarine");
		this.size = 1;
	}

	@Override
	public boolean hit(int shootX, int shootY) {
		System.out.println("hi");
		if (this.shipCheck[shootY][shootX])
			this.alive = false;
		return this.alive;
	}

}
