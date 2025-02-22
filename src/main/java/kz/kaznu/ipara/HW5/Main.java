package kz.kaznu.ipara.HW5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Зефир", 45.0, 80);
        Dog dog = new Dog("Марс", 65.0, 15.0, 150);
        Horse horse = new Horse("Бран", 175.0, 45.0, 400);

        cat.run(20);
        cat.swim(2);
        cat.info();

        dog.run(75);
        dog.swim(15);
        dog.info();

        horse.run(150);
        horse.swim(40);
        horse.info();
    }
}
