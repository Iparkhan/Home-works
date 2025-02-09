package kz.kaznu.ipara.L1;

public class MainApp {
    public static void main(String[] args) {
        diagonal();
        //1 задание
        int[][] array = {
                {1, -2, 3},
                {4, 5, -6},
                {-7, 8, 9}
        };
        int result = sumOfPositiveElements(array);
        System.out.println("сумма положительных элементов " + result);
        int[][] array2 = {
                {1, -2, 3},
                {4, 5, -6},
                {-7, 8, 9}
        };
        int maxElement = findMax(array2);
        System.out.println("максимальный элемент:" + maxElement);
        int[][] Array01 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] Array02 = {
                {1, 2, 3}
        };
        System.out.println("Сумма элементов второй строки Arrray01: " + sumOfSecondRow(Array01));
        System.out.println("Сумма элементов второй строки Array02: " + sumOfSecondRow(Array02));
// 1 задание
        int size = 3;
        printSquare(size);
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    // 2 задание
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3 задание
    public static void diagonal() {
        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (i < (1 + j) && j < (i + 1)) {
                    System.out.print("0");
                } else {
                    char symbol = '*';
                    System.out.print(symbol);
                }
            }
            System.out.println();
        }
    }

    // 4 задание
    public static int findMax(int[][] array2) {
        int max = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max) {
                    max = array2[i][j];
                }
            }
        }
        return max;
    }

    //5 задание
    public static int sumOfSecondRow(int[][] array3) {
        if (array3.length < 2) {
            return -1;
        }
        int sum = 0;
        for (int j = 0; j < array3[1].length; j++) {
            sum += array3[1][j];
        }
        return sum;
    }
}



