package kz.kaznu.ipara.HW2;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        // 1 задание
       int[] arr= new int[7];
        repeatString(5, "Привет,Деляфруз!");

        int[] arr = {4, 6, 8, 9, -3};
        sumGreaterThanFive(arr);

        int[] array = new int[5];
        fillArray(7, array);
        System.out.println(Arrays.toString(array));


        int[] array1 = {4, 7, 2, 6, 1};
        incrementArray(3, array1);

        int[] array2 = {1, 5, -3, 4, 7, 9};
        compareHalvesSum(array2);
    }

    // 1 задание
    public static void repeatString(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 2 задание
    public static void sumGreaterThanFive(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов больше 5: " + sum);
    }

    // 3 задание
    public static void fillArray(int value, int[] array) {
        Arrays.fill(array, value);
    }

    // 4 задание
    public static void incrementArray(int value, int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] += value;
        }
        System.out.println(Arrays.toString(array1));
    }

    // 5 задание
    public static void compareHalvesSum(int[] array2) {
        int mid = array2.length / 2;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < mid; i++) {
            sum1 += array2[i];
        }
        for (int i = mid; i < array2.length; i++) {
            sum2 += array2[i];
        }

        if (sum1 > sum2) {
            System.out.println("Сумма первой половины больше: " + sum1);
        } else if (sum2 > sum1) {
            System.out.println("Сумма второй половины больше: " + sum2);
        } else {
            System.out.println("Суммы обеих половин равны: " + sum1);
        }

    }





