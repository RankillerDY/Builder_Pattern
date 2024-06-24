package ProductInterface;

public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildPool(boolean hasPool);
    Builder buildWall(boolean hasWall);
    Builder buildDoors(boolean hasDoors);
    Builder buildColor(String color);
}
