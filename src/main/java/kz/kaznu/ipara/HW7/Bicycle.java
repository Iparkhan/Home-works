package kz.kaznu.ipara.HW7;

class Bicycle implements Transport {
    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.БОЛОТО) {
            System.out.println("Велосипед не может ехать по болоту");
            return false;
        }
        System.out.println("Велосипед проехал " + distance + " км по " + terrain);
        return true;
    }

    @Override
    public String getName() {
        return "велосипед";
    }
}
