package kz.kaznu.ipara.HW9;
import java.util.*;
class ListUtils {
    public static ArrayList<Integer> generateRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // 2. Суммирование всех чисел > 5 в списке
    public static int sumGreaterThanFive(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    // 3. Заполнение списка указанным числом
    public static void fillListWithNumber(int number, ArrayList<Integer> list) {
        Collections.fill(list, number);
    }

    // 4. Увеличение каждого элемента списка на указанное число
    public static void increaseEachElement(int increment, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + increment);
        }
    }

    // 5. Получение списка имен сотрудников
    public static ArrayList<String> getEmployeeNames(ArrayList<Employee> employees) {
        ArrayList<String> names = new ArrayList<>();
        for (Employee e : employees) {
            names.add(e.name);
        }
        return names;
    }

    // 6. Фильтрация сотрудников по минимальному возрасту
    public static ArrayList<Employee> filterEmployeesByAge(ArrayList<Employee> employees, int minAge) {
        ArrayList<Employee> filtered = new ArrayList<>();
        for (Employee e : employees) {
            if (e.age >= minAge) {
                filtered.add(e);
            }
        }
        return filtered;
    }

    // 7. Проверка, превышает ли средний возраст сотрудников заданное значение
    public static boolean isAverageAgeGreaterThan(ArrayList<Employee> employees, double minAvgAge) {
        if (employees.isEmpty()) return false;
        double sum = 0;
        for (Employee e : employees) {
            sum += e.age;
        }
        return (sum / employees.size()) > minAvgAge;
    }

    // 8. Поиск самого молодого сотрудника
    public static Employee getYoungestEmployee(ArrayList<Employee> employees) {
        return Collections.min(employees, Comparator.comparingInt(e -> e.age));
    }
}
