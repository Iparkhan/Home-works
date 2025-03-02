package kz.kaznu.ipara.HW7;

class Car implements Transport {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override

    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.DENSE_FOREST || terrain == Terrain.SWAMP) {
            System.out.println("Машина не может двигаться по этой местности.");
            return false;
        }
        if (fuel >= distance) {
            fuel -= distance;
            System.out.println("Машина проехала " + distance + " км. Осталось топлива: " + fuel);
            return true;
        } else {
            System.out.println("Недостаточно топлива для поездки.");
            return false;
        }
    }
}
