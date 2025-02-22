package kz.kaznu.ipara.HW5;

public abstract class Animal {
    public String name;
    public double runSpeed;
    public double swimSpeed;
    public int stamina; //выносливость
    public boolean isTired = false;

    public Animal(String name, double runSpeed, double swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public double run(int distance) {
        int requiredStamina = distance;
        if (stamina < requiredStamina) {
            isTired = true;
            System.out.println(name + " устал и не может пробежать " + distance + " м.");
            return -1;
        }
        stamina -= requiredStamina;
        double time = distance / runSpeed;
        System.out.println(name + " пробежал " + distance + " м за " + time + " с.");
        return time;
    }

    public abstract double swim(int distance);

    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Выносливость: " + stamina);
        System.out.println("Состояние: " + (isTired ? "Устал" : "Бодр"));
    }
}

