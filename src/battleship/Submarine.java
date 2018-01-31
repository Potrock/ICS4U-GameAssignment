package battleship;

public class Submarine extends Ship {
    public int endGame = 0;

    public Submarine() {
        int userX = (int) (Math.round(5 * Math.random()));
        int userY = (int) (Math.round(5 * Math.random()));
        this.posX = userX;
        this.posY = userY;
        this.shipCheck[this.posY][this.posX] = true;
        this.id++;
        this.getShip("Submarine");
    }

    @Override
    public boolean hit(int shootX, int shootY) {
        if (this.shipCheck[shootY][shootX])
            this.alive = false;
        return this.alive;
    }

    public void hit() {
        if (!this.alive)
            endGame++;
        if (endGame == 1) {
            System.out.println("You win!");
            System.exit(1);
        }
        new Play();
    }

}