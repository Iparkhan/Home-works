package kz.kaznu.ipara.HW9;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            // Работа с числами
            ArrayList<Integer> rangeList = ListUtils.generateRange(1, 10);
            System.out.println("Range List: " + rangeList);

            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 7, 9, 2, 6));
            System.out.println("Sum of elements > 5: " + ListUtils.sumGreaterThanFive(numbers));

            ArrayList<Integer> listToFill = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            ListUtils.fillListWithNumber(10, listToFill);
            System.out.println("Filled List: " + listToFill);

            ArrayList<Integer> listToIncrement = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
            ListUtils.increaseEachElement(5, listToIncrement);
            System.out.println("Incremented List: " + listToIncrement);

            // Работа с сотрудниками
            ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                    new Employee("Alice", 25),
                    new Employee("Bob", 30),
                    new Employee("Charlie", 22)
            ));

            System.out.println("Employee Names: " + ListUtils.getEmployeeNames(employees));
            System.out.println("Employees with age >= 25: " + ListUtils.filterEmployeesByAge(employees, 25));
            System.out.println("Average age > 26: " + ListUtils.isAverageAgeGreaterThan(employees, 26));
            System.out.println("Youngest Employee: " + ListUtils.getYoungestEmployee(employees));
        }
}
