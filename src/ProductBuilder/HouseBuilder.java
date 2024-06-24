package ProductBuilder;

import Product.House;
import ProductInterface.Builder;

public class HouseBuilder implements Builder {
    private int walls;
    private int doors;
    private boolean hasPool;
    private boolean hasRoof;
    private String color;

    @Override
    public Builder buildRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
        return null;
    }

    @Override
    public Builder buildPool(boolean hasPool) {
        this.hasPool = hasPool;
        return null;
    }

    @Override
    public Builder buildWalls(int hasWall) {
        this.walls = hasWall;
        return null;
    }

    @Override
    public Builder buildDoors(int hasDoors) {
        this.doors = hasDoors;
        return null;
    }

    @Override
    public Builder buildColor(String color) {
        this.color = color;
        return null;
    }

    @Override
    public House buildHouse() {
        return new House(walls, doors, hasPool, color, hasRoof);
    }
}
