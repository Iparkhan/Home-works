package kz.kaznu.ipara.HW7;

class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void sitOnTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " села на транспорт.");
    }

    public void getOffTransport() {
        this.currentTransport = null;
        System.out.println(name + " слезла с транспорта.");
    }

    public boolean move(Terrain terrain, int distance) {
        if (currentTransport != null) {
            return currentTransport.move(terrain, distance);
        } else {
            System.out.println(name + " прошла " + distance + " км пешком.");
            return true;
        }
    }
}
