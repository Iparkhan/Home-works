package kz.kaznu.ipara.HW7;

public class Main {
    public static void main(String[] args) {
        Human eva = new Human("Ева");
        Transport car = new Car();
        Transport horse = new Horse();
        Transport bike = new Bicycle();
        Transport atv = new ATV();

        eva.boardTransport(car);
        eva.move(Terrain.РАВНИНА, 10);
        eva.move(Terrain.БОЛОТО, 5);
        eva.leaveTransport();

        eva.boardTransport(horse);
        eva.move(Terrain.РАВНИНА, 5);
        eva.move(Terrain.БОЛОТО, 3);
        eva.leaveTransport();

        eva.boardTransport(bike);
        eva.move(Terrain.РАВНИНА, 2);
        eva.leaveTransport();

        eva.boardTransport(atv);
        eva.move(Terrain.ГУСТОЙ_ЛЕС, 20);
        eva.leaveTransport();
    }
}
