package battleship;

public class Submarine extends Ship {
    // went endGame gets incremented to 1 the game is finished
    public int endGame = 0;
    
    public Submarine() {
        // randomizes the position of the ship
        int userX = (int) (Math.round(5 * Math.random()));
        int userY = (int) (Math.round(5 * Math.random()));
        this.posX = userX;
        this.posY = userY;
        // sets the grid space that the ship occupies to true
        this.shipCheck[this.posY][this.posX] = true;
        this.id++;
        this.getShip("Submarine");
    }

    @Override
    public boolean hit(int shootX, int shootY) {
        // checks if the location of the shot is the location of the ship --> if so, the ship is dead
        if (this.shipCheck[shootY][shootX])
            this.alive = false;
        // otherwise the ship is alive
        return this.alive;
    }

    public void hit() {
        // if the ship is not alive, the game will end
        if (!this.alive)
            endGame++;
        if (endGame == 1) {
            System.out.println("You win!");
            System.exit(1);
        }
        new Play();
    }

}
