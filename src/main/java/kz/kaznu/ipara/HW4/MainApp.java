package kz.kaznu.ipara.HW4;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Николаевна", "Анна", "Фёдорова", 1978, "anna.fedorova@example.com"),
                new User("Иванович", "Иван", "Иванов", 1999, "ivan.ivanov@example.com"),
                new User("Александровна", "Мария", "Петрова", 1987, "maria.petrova@example.com"),
                new User("Андреевич", "Дмитрий", "Смирнов", 2010, "dmitry.smirnov@example.com"),
                new User("Владимировна", "Елена", "Сидорова", 2000, "elena.sidorova@example.com"),
                new User("Збарская", "Регина", "Антоновна", 1976, "anna.fedorova@example.com"),
                new User("Александрович", "Николай", "Михайлов", 1969, "nikolay.mikhailov@example.com"),
        };

        for (int i = 0; i < users.length; i++) {
            if (2025 - users[i].birthYear > 40) {
                users[i].displayInfo();
            }
        }
    }
}
