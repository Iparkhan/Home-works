package kz.kaznu.ipara.HW12;
import java.io.*;
import java.net.*;
class ClientHandler extends Thread {
    private Socket socket;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            out.println("Доступные операции: +, -, *, /");
            String input;
            while ((input = in.readLine()) != null) {
                String[] parts = input.split(" ");
                if (parts.length != 3) {
                    out.println("Ошибка: неверный формат запроса");
                    continue;
                }
                try {
                    double num1 = Double.parseDouble(parts[0]);
                    double num2 = Double.parseDouble(parts[2]);
                    String operator = parts[1];
                    double result = calculate(num1, num2, operator);
                    out.println("Результат: " + result);
                } catch (NumberFormatException e) {
                    out.println("Ошибка: некорректные числа");
                } catch (ArithmeticException e) {
                    out.println("Ошибка: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "*": return num1 * num2;
            case "/":
                if (num2 == 0) throw new ArithmeticException("Деление на ноль");
                return num1 / num2;
            default: throw new IllegalArgumentException("Неподдерживаемая операция");
        }
    }
}
