package Product;

public class House {
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    public House(int walls, String color, boolean hasRoof, boolean hasPool, int doors) {
        this.walls = walls;
        this.color = color;
        this.hasRoof = hasRoof;
        this.hasPool = hasPool;
        this.doors = doors;
    }

    public int getWalls() {
        return walls;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public int getDoors() {
        return doors;
    }
}
