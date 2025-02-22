package kz.kaznu.ipara.HW5;

public class Cat extends Animal {
    public Cat(String name, double runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1;
    }
}

