import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("Gross salary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println(employee);

        System.out.print("Enter the percentage to increase salary: ");
        double percentageIncrease = scanner.nextDouble();

        employee.increaseSalary(percentageIncrease);

        System.out.println(employee);

        scanner.close();
    }
}
