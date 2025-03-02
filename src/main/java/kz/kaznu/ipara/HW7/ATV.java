package kz.kaznu.ipara.HW7;

 class ATV implements Transport {
     private int fuel;

     public ATV(int fuel) {
         this.fuel = fuel;
     }

     @Override
     public boolean move(Terrain terrain, int distance) {
         if (fuel >= distance) {
             fuel -= distance;
             System.out.println("Вездеход проехал " + distance + " км. Осталось топлива: " + fuel);
             return true;
         } else {
             System.out.println("Недостаточно топлива для поездки.");
             return false;
         }
     }
}
