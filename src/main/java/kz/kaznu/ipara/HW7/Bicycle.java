package kz.kaznu.ipara.HW7;

 class Bicycle implements Transport {
     @Override
     public boolean move(Terrain terrain, int distance) {
         if (terrain == Terrain.SWAMP) {
             System.out.println("Велосипед не может двигаться по болоту.");
             return false;
         }
         System.out.println("Велосипед проехал " + distance + " км.");
         return true;
     }
}
