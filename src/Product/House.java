package Product;

public class House {
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    public House(int walls, int doors, boolean hasPool, String color, boolean hasRoof) {
        this.walls = walls;
        this.doors = doors;
        this.hasPool = hasPool;
        this.color = color;
        this.hasRoof = hasRoof;
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

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", hasPool=" + hasPool +
                ", hasRoof=" + hasRoof +
                ", color='" + color + '\'' +
                '}';
    }
}
