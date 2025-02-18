package kz.kaznu.ipara.HW4;

public class Box {
    private final double width, height, depth;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(double width, double height, double depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = false;
        this.item = null;
    }

    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта.");
        } else {
            System.out.println("Коробка уже открыта.");
        }
    }

    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта.");
        } else {
            System.out.println("Коробка уже закрыта.");
        }
    }

    public void repaint(String newColor) {
        this.color = newColor;
        System.out.println("Коробка перекрашена в " + newColor + ".");
    }

    public void putItem(String newItem) {
        if (isOpen) {
            if (item == null) {
                item = newItem;
                System.out.println("В коробку положили: " + newItem);
            } else {
                System.out.println("В коробке уже есть предмет: " + item);
            }
        } else {
            System.out.println("Коробка закрыта! Нельзя положить предмет.");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (item != null) {
                System.out.println("Из коробки вытащили: " + item);
                item = null;
            } else {
                System.out.println("В коробке и так ничего нет.");
            }
        } else {
            System.out.println("Коробка закрыта! Нельзя достать предмет.");
        }
    }

    public void printInfo() {
        System.out.println("Коробка размером " + width + "x" + height + "x" + depth + ", цвет: " + color + ", " + (isOpen ? "открыта" : "закрыта") + ", предмет внутри: " + (item != null ? item : "нет"));
    }
}
