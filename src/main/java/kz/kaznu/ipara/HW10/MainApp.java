package kz.kaznu.ipara.HW10;
import java.util.*;
public class MainApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Иван Иванов", "123-456");
        pb.add("Иван Иванов", "789-101");
        pb.add("Мария Смирнова", "111-222");

        System.out.println("Телефоны Ивана Иванова: " + pb.find("Иван Иванов"));
        System.out.println("Есть ли номер 789-101? " + pb.containsPhoneNumber("789-101"));
        System.out.println("Есть ли номер 333-444? " + pb.containsPhoneNumber("333-444"));
    }
}
