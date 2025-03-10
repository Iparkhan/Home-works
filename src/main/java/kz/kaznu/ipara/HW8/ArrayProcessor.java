package kz.kaznu.ipara.HW8;

public class ArrayProcessor {
    public static int processArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        if (array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new AppArraySizeException("Массив должен быть размером 4x4");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка в ячейке: [" + i + "][" + j + "] - некорректные данные: " + array[i][j]);
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String[][] correctArray = {{"1", "2", "3", "4"},
                                   {"5", "6", "7", "8"},
                                   {"9", "10", "11", "12"},
                                   {"13", "14", "15", "16"}};

        String[][] incorrectSizeArray = {{"1", "2", "3"},
                                         {"4", "5", "6"},
                                         {"7", "8", "9"}};

        String[][] incorrectDataArray = {{"1", "2", "3", "4"},
                                         {"5", "X", "7", "8"},
                                         {"9", "10", "11", "12"},
                                         {"13", "14", "15", "16"}};

        try {
            System.out.println("Сумма элементов: " + processArray(correctArray));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма элементов: " + processArray(incorrectSizeArray));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            System.out.println("Сумма элементов: " + processArray(incorrectDataArray));
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

