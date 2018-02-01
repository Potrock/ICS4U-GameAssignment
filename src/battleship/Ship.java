package battleship;

public abstract class Ship {
    // true for alive
    public boolean alive = true;
    // the coordinates of the ship
    public int posX, posY;
    public int id = 1;
    // creates a boolean array to check if there is a ship or not in a grid space
    public boolean[][] shipCheck = new boolean[5][5];
    private String name;

    public Ship() {
    }

    // abstract method for the hit method that is implemented in submarine class
    public abstract boolean hit(int shootX, int shootY);

    // method to get the name of the ship
    public String getShip(String name) {
        return this.name;
    }

}
