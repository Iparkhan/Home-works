package kz.kaznu.ipara.HW1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //greetings();
        //checkSign();
        // selectColor();
        //compareNumbers();
        addOrSubtractAndPrint(5,6,false);;
    }
    // задание 1
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    //задание 2
    public static void checkSign() {
        int a = -3;
        int b = -5;
        int c = 7;
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }

    // задание 3
    public static void selectColor() {
        Scanner Cherry = new Scanner(System.in);
        System.out.print("Введите число");
        int data = Cherry.nextInt();
        if (data <= 10) {
            System.out.println("КРАСНЫЙ");
        } else if (data > 10 && data <= 20) {
            System.out.println("ЖЕЛТЫЙ");
        } else if (data > 20) {
            System.out.println("ЗЕЛЕНЫЙ");
        } else {
            System.out.println("не правильное число");
        }
    }
    //задание 4
    public static void compareNumbers()  {
        int a=5;
        int b=6;
        if(a>=b){
            System.out.println("a >= b");
        } else{
            System.out.println("a < b");

        }


    }
    // задание 5
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if(increment){
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
