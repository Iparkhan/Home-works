package kz.kaznu.ipara.HW10;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Нурали", "87083678164");
        pb.add("Деля", "111-111");
        pb.add("Карина", "222-222");
        pb.add("Вика", "333-444");
        pb.add("Деля", "555-666");
        pb.add("Нурали", "777-888");
        pb.add("Ислам", "999-000");


        System.out.print("Введите имя для поиска номеров: ");
        Scanner scanner = new Scanner(System.in);
        String searchName = scanner.nextLine();
        Set<String> numbers = pb.find(searchName);

        if (numbers.isEmpty()) {
            System.out.println("Телефоны не найдены для: " + searchName);
        } else {
            System.out.println("Телефоны " + searchName + ": " + numbers);
        }


        System.out.print("Введите номер телефона для проверки: ");
        String phoneToCheck = scanner.nextLine();
        System.out.println("Есть ли номер " + phoneToCheck + "? " + pb.containsPhoneNumber(phoneToCheck));

        scanner.close();
    }
}
