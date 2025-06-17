package Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Алексей", "Инженер", 4500);

        emp1.displayInfo();

        System.out.println("Увеличим зарплату на 1000");
        emp1.increaseSalary(1000);
        emp1.displayInfo();

        System.out.println("Это высокая зарплата? " + (emp1.isHighSalary() ? "Да" : "Нет"));

        System.out.println("Уменьшим зарплату на 3000");
        emp1.decreaseSalary(3000);
        emp1.displayInfo();

        System.out.println("Изменим зарплату на 2000 напрямую");
        emp1.changeSalary(2000);
        emp1.displayInfo();

        System.out.println("Текущая должность: " + emp1.getPosition());
        System.out.println("Обновим должность на 'Старший инженер'");
        emp1.updatePosition("Старший инженер");
        emp1.displayInfo();

        System.out.println("Вывод через toString(): " + emp1.toString());
    }
}
