package kz.kaznu.ipara.HW4;

public class Main {
    public static void main(String[] args) {
        Box myBox = new Box(10, 15, 20, "серая");
        myBox.printInfo();
        myBox.open();
        myBox.putItem("помада");
        myBox.printInfo();
        myBox.close();
        myBox.open();
        myBox.removeItem();
        myBox.printInfo();
        myBox.repaint("розовый");
        myBox.printInfo();
    }
}

