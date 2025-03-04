package kz.kaznu.ipara.HW7;

interface Transport {
    boolean move(Terrain terrain, int distance);
    String getName();
}
