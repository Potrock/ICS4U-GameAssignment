package battleship;

public abstract class Ship {
    public boolean alive = true; // true for alive
    public int posX, posY;
    public int id = 1;
    public boolean[][] shipCheck = new boolean[5][5];
    private String name;

    public Ship() {
    }

    public abstract boolean hit(int shootX, int shootY);

    public String getShip(String name) {
        return this.name;
    }

}