public class GradeStatistics { 
    public final double average;
    public final double highest;
    public final double lowest;
    public final int passedStudents;
    public final int failedStudents;

    public GradeStatistics(double average, double highest, double lowest, int passedStudents, int failedStudents) {
        this.average = average;
        this.highest = highest;
        this.lowest = lowest;
        this.passedStudents = passedStudents;
        this.failedStudents = failedStudents;
    }
}
