package kz.kaznu.ipara.HW10;
import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String name, String phoneNumber) {
        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }

    // Метод для поиска номеров по имени
    public Set<String> find(String name) {
        return phoneBook.getOrDefault(name, Collections.emptySet());
    }

    // Метод для проверки наличия номера телефона в справочнике
    public boolean containsPhoneNumber(String phoneNumber) {
        return phoneBook.values().stream().anyMatch(set -> set.contains(phoneNumber));
    }
}
