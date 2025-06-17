package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double averageGrade() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public void displayInfo() {
        System.out.println("Студент: " + firstName + " " + lastName + ", оценки: " + grades);
    }

    public int getHighestGrade() {
        if (grades.isEmpty()) return 0;
        return grades.stream().max(Integer::compare).get();
    }

    public int getLowestGrade() {
        if (grades.isEmpty()) return 0;
        return grades.stream().min(Integer::compare).get();
    }

    public void updateLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public int getGradesCount() {
        return grades.size();
    }

    public boolean isPassed() {
        return averageGrade() > 4;
    }
}


