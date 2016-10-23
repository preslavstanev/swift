package Task2_EmployeeSalarySort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = employee();
        Arrays.sort(employee);
        String[] employee1 = getToString(employee).split(",");
        printEmployee(employee1);
    }

    public static Employee[] employee() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        Employee[] employeeArr = new Employee[n];
        for (int i = 0; i < n; i++) {
            String employee = input.nextLine();
            String[] array = employee.split(",");
            String name = array[0];
            int salary = Integer.parseInt(array[1]);
            String position = array[2];
            String department = array[3];

            if (array[4] != null && array[5] != null) {
                int age = Integer.parseInt(array[4]);
                String email = array[5];
                Employee newEmployee = new Employee(name, salary, position, department, age, email);
                employeeArr[i] = newEmployee;
            } else {
                Employee newEmployee = new Employee(name, salary, position, department);
                employeeArr[i] = newEmployee;
            }
        }
        return employeeArr;
    }

    public static String getToString(Employee[] employee) {
        StringBuilder result = new StringBuilder(employee.length);
        for (Employee emp : employee) {
            result.append(emp.toString()).append(",");
        }
        return result.toString();
    }

    public static void printEmployee(String[] employee) {
        for (String emp : employee) {
            System.out.println(emp);
        }
    }
}
