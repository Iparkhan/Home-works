package kz.kaznu.ipara.HW6;

public class Plate {
    private final int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood; //  тарелка полностью заполняется едой
    }

    public void addFood(int amount) {
        if (amount > 0) {
            currentFood = Math.min(currentFood + amount, maxFood);
            System.out.println("Добавлено " + amount + " единиц еды. Текущее количество еды: " + currentFood);
        }
    }

    public boolean decreaseFood(int amount) {
        if (amount <= currentFood) {
            currentFood -= amount;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + currentFood + "/" + maxFood);
    }
}
