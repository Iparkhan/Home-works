package kz.kaznu.ipara.HW7;

class Horse implements Transport {

    private int stamina = 25;

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.БОЛОТО) {
            System.out.println("Лошадь не может идти по болоту");
            return false;
        }
        if (stamina >= distance) {
            stamina -= distance;
            System.out.println("Лошадь прошла " + distance + " км по " + terrain + ", осталось сил: " + stamina);
            return true;
        }
        System.out.println("Лошадь устала!");
        return false;
    }

    @Override
    public String getName() {
        return "лошадь";
    }
}
