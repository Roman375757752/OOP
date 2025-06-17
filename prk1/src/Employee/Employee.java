package Employee;

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void changeSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayInfo() {
        System.out.println("Сотрудник: " + name + ", должность: " + position + ", зарплата: " + salary);
    }

    public void increaseSalary(double amount) {
        salary += amount;
    }

    public void decreaseSalary(double amount) {
        salary = Math.max(0, salary - amount);
    }

    public boolean isHighSalary() {
        return salary > 5000;
    }

    public String getPosition() {
        return position;
    }

    public void updatePosition(String newPosition) {
        this.position = newPosition;
    }

    public String toString() {
        return name + " - " + position + " (" + salary + ")";
    }
}