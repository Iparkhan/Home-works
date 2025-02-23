package kz.kaznu.ipara.HW6;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(50);

        Cat[] cats = {new Cat("Барсик", 15), new Cat("Пушок", 20), new Cat("Рыжик", 10), new Cat("Снежок", 25), new Cat("Царь", 6)};

        System.out.println("Начальное состояние тарелки:");
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\nСостояние тарелки после кормления котов:");
        plate.info();

        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": " + (cat.isFull() ? "сыт" : "голоден"));
        }
    }
}
