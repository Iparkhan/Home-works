package kz.kaznu.ipara.HW7;

class Car implements Transport {
    private int fuel = 40;

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.ГУСТОЙ_ЛЕС || terrain == Terrain.БОЛОТО) {
            System.out.println("Машина не может ехать по " + terrain);
            return false;
        }
        if (fuel >= distance * 2) {
            fuel -= distance * 2;
            System.out.println("Машина проехала " + distance + " км по " + terrain + ", осталось топлива: " + fuel);
            return true;
        }
        System.out.println("Не хватает топлива для поездки!");
        return false;
    }

    @Override
    public String getName() {
        return "машина";
    }
}
