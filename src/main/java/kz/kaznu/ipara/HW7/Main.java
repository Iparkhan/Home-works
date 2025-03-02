package kz.kaznu.ipara.HW7;

public class Main {
    public static void main(String[] args) {
        Human eva = new Human("Ева");
        Car car = new Car(50);
        Horse horse = new Horse(30);
        Bicycle bicycle = new Bicycle();
        ATV atv = new ATV(40);

        eva.sitOnTransport(car);
        eva.move(Terrain.PLAIN, 20);
        eva.getOffTransport();

        eva.sitOnTransport(horse);
        eva.move(Terrain.DENSE_FOREST, 10);
        eva.getOffTransport();

        eva.sitOnTransport(bicycle);
        eva.move(Terrain.PLAIN, 15);
        eva.getOffTransport();

        eva.sitOnTransport(atv);
        eva.move(Terrain.SWAMP, 25);
        eva.getOffTransport();
    }
}
