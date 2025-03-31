package kz.kaznu.ipara.HW12;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println(in.readLine()); // Получаем доступные операции

            while (true) {
                System.out.print("Введите выражение (например, 5 + 3) или 'exit' для выхода: ");
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) break;
                out.println(input);
                System.out.println("Ответ от сервера: " + in.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
