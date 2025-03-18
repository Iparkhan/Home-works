package kz.kaznu.ipara.HW11;
import java.io.*;
import java.util.Scanner;

public class FileManager {
    private static final String DIRECTORY = "."; // Корневой каталог проекта

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вывод списка текстовых файлов
        System.out.println("Список доступных текстовых файлов:");
        File folder = new File(DIRECTORY);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("Нет доступных текстовых файлов.");
            return;
        }

        for (File file : files) {
            System.out.println("- " + file.getName());
        }

        // Запрос имени файла
        System.out.print("\nВведите имя файла: ");
        String fileName = scanner.nextLine();
        File file = new File(DIRECTORY, fileName);

        // Проверка существования файла
        if (!file.exists()) {
            System.out.println("Файл не найден.");
            return;
        }

        // Чтение и вывод содержимого файла
        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        // Запись новых строк в файл
        System.out.println("\nВведите строки для записи в файл (для выхода введите 'exit'):");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                writer.write(input);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        System.out.println("Запись завершена.");
    }
}
