import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeTrackerService {
    // Arraylist to store all students dynamically
    private List<Student> students;

    public GradeTrackerService() {
        this.students = new ArrayList<>();
    }

    // Method to add a new student
    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    // Sorting logic using Comparable interface from Student class
    public void sortStudentsByRank() {
        Collections.sort(students);
    }

    // Calculating Analytics
    public GradeStatistics calculateStatistics() {
        if (students.isEmpty()) {
            return new GradeStatistics(0, 0, 0, 0, 0);
        }

        double sum = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;
        int passed = 0;
        int failed = 0;

        for (Student s : students) {
            double grade = s.getGrade();
            sum += grade;

            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;

            if (grade >= 60) passed++;
            else failed++;
        }

        double average = sum / students.size();
        return new GradeStatistics(average, highest, lowest, passed, failed);
    }
}