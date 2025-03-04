package kz.kaznu.ipara.HW7;

class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void boardTransport(Transport transport) {
        this.currentTransport = transport;
        System.out.println(name + " села на " + transport.getName());
    }

    public void leaveTransport() {
        if (currentTransport != null) {
            System.out.println(name + " встала с " + currentTransport.getName());
            currentTransport = null;
        } else {
            System.out.println(name + " не находится в транспорте");
        }
    }

    public boolean move(Terrain terrain, int distance) {
        if (currentTransport != null) {
            return currentTransport.move(terrain, distance);
        } else {
            System.out.println(name + " идёт пешком " + distance + " км по " + terrain);
            return true;
        }
    }
}


