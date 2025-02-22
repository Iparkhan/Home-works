package kz.kaznu.ipara.HW5;

public class Dog extends Animal {
    public Dog(String name, double runSpeed, double swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double swim(int distance) {
        int requiredStamina = distance * 2;
        if (stamina < requiredStamina) {
            isTired = true;
            System.out.println(name + " устал и не может проплыть " + distance + " м.");
            return -1;
        }
        stamina -= requiredStamina;
        double time = distance / swimSpeed;
        System.out.println(name + " проплыл " + distance + " м за " + time + " с.");
        return time;

    }
}
