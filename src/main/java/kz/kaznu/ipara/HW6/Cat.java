package kz.kaznu.ipara.HW6;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean isFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false; // При кот голоден
    }

    public void eat(Plate plate) {
        if (!isFull && plate.decreaseFood(appetite)) {
            isFull = true;
            System.out.println(name + " поел. Его аппетит был " + appetite + ".");
        } else {
            System.out.println(name + " не смог поесть. Недостаточно еды :(");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public String getName() {
        return name;
    }
}
