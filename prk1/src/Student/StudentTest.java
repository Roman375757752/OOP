package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Иван", "Иванов");

        student1.displayInfo();

        System.out.println("Добавим оценки: 5, 4, 3");
        student1.addGrade(5);
        student1.addGrade(4);
        student1.addGrade(3);
        student1.displayInfo();

        System.out.println("Средняя оценка: " + student1.averageGrade());
        System.out.println("Самая высокая оценка: " + student1.getHighestGrade());
        System.out.println("Самая низкая оценка: " + student1.getLowestGrade());
        System.out.println("Количество оценок: " + student1.getGradesCount());
        System.out.println("Сдал ли студент? " + (student1.isPassed() ? "Да" : "Нет"));

        System.out.println("Меняем фамилию на Петров");
        student1.updateLastName("Петров");
        student1.displayInfo();
    }
}
