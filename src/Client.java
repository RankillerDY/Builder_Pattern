import Product.House;
import ProductBuilder.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildWalls(4)
                .buildColor("red").buildPool(true)
                .buildRoof(true)
                .buildHouse();
        System.out.println("Result " + house.toString());
    }
}