package entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public double calculateNetSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    @Override
    public String toString() {
        return String.format("Employee: %s; Net salary: %.2f", name, calculateNetSalary());
    }
}
