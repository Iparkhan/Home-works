package kz.kaznu.ipara.HW5;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Зефир", 5.0, 10);
        Dog dog = new Dog("Марс", 6.0, 2.0, 20);
        Horse horse = new Horse("Бран", 10.0, 3.0, 30);

        cat.run(5);
        cat.swim(2);
        cat.info();

        dog.run(10);
        dog.swim(5);
        dog.info();

        horse.run(15);
        horse.swim(4);
        horse.info();
    }
}
