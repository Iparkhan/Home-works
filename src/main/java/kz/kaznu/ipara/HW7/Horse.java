package kz.kaznu.ipara.HW7;

 class Horse implements Transport {
     private int stamina;

     public Horse(int stamina) {
         this.stamina = stamina;
     }

     @Override
     public boolean move(Terrain terrain, int distance) {
         if (terrain == Terrain.SWAMP) {
             System.out.println("Лошадь не может двигаться по болоту.");
             return false;
         }
         if (stamina >= distance) {
             stamina -= distance;
             System.out.println("Лошадь пробежала " + distance + " км. Осталось сил: " + stamina);
             return true;
         } else {
             System.out.println("Лошадь устала и не может продолжить путь.");
             return false;
         }
     }
}
