package kz.kaznu.ipara.HW7;

class ATV implements Transport {
    private int fuel = 70;

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (fuel >= distance * 3) {
            fuel -= distance * 3;
            System.out.println("Вездеход проехал " + distance + " км по " + terrain + ", осталось топлива: " + fuel);
            return true;
        }
        System.out.println("Вездеходу не хватает топлива!");
        return false;
    }

    @Override
    public String getName() {
        return "вездеход";
    }
}
