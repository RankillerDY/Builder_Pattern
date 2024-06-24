package ProductInterface;

import Product.House;

public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildPool(boolean hasPool);
    Builder buildWalls(int hasWall);
    Builder buildDoors(int hasDoors);
    Builder buildColor(String color);

    House buildHouse();
}
