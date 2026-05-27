public class Student implements Comparable<Student> {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    // Automatic Letter Grade Calculation
    public String getLetterGrade() {
        if (grade >= 90) return "A";
        else if (grade >= 80) return "B";
        else if (grade >= 70) return "C";
        else if (grade >= 60) return "D";
        else return "F";
    }

    // Sorting Logic (Highest to Lowest)
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.grade, this.grade);
    }

    // Output formatting
    @Override
    public String toString() {
        return String.format("%-20s | %-7.2f | %-5s", name, grade, getLetterGrade());
    }
}