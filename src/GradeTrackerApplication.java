import java.util.Scanner;

public class GradeTrackerApplication {
    private static final Scanner scanner = new Scanner(System.in);
    private static final GradeTrackerService trackerService = new GradeTrackerService();

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("   Enterprise Student Grade Tracker");
        System.out.println("=========================================");

        while (running) {
            printMenu();
            int choice = getIntInput("Enter your choice (1-5): ");

            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    displaySummaryReport();
                    break;
                case 3:
                    displayRankings();
                    break;
                case 4:
                    displayGradingCriteria();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a number between 1 and 5.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Add a New Student");
        System.out.println("2. View Summary Report & Analytics");
        System.out.println("3. View Student Rankings (Highest to Lowest)");
        System.out.println("4. View Grading Criteria");
        System.out.println("5. Exit");
    }

    private static void addNewStudent() {
        String name = getValidNameInput("Enter student's name: ");
        double grade = getDoubleInput("Enter student's grade (0-100): ");

        if (grade < 0 || grade > 100) {
            System.out.println("Error: Grade must be between 0 and 100.");
            return;
        }

        trackerService.addStudent(new Student(name, grade));
        System.out.println("Success: Student '" + name + "' added successfully!");
    }

    private static void displaySummaryReport() {
        if (trackerService.isEmpty()) {
            System.out.println("\nNo students data available. Please add students first.");
            return;
        }

        System.out.println("\n================ SUMMARY REPORT ================");
        System.out.println(String.format("%-20s | %-7s | %-5s", "STUDENT NAME", "MARKS", "GRADE"));
        System.out.println("------------------------------------------------");

        for (Student s : trackerService.getAllStudents()) {
            System.out.println(s.toString());
        }

        GradeStatistics stats = trackerService.calculateStatistics();

        System.out.println("------------------------------------------------");
        System.out.printf("Average Class Marks : %.2f\n", stats.average);
        System.out.printf("Highest Marks       : %.2f\n", stats.highest);
        System.out.printf("Lowest Marks        : %.2f\n", stats.lowest);
        System.out.println("------------------------------------------------");
        System.out.printf("Students Passed     : %d\n", stats.passedStudents);
        System.out.printf("Students Failed     : %d\n", stats.failedStudents);
        System.out.println("================================================");
    }

    private static void displayRankings() {
        if (trackerService.isEmpty()) {
            System.out.println("\nNo students data available.");
            return;
        }

        trackerService.sortStudentsByRank();

        System.out.println("\n================ CLASS RANKINGS ================");
        System.out.println(String.format("%-5s | %-20s | %-7s | %-5s", "RANK", "STUDENT NAME", "MARKS", "GRADE"));
        System.out.println("------------------------------------------------");

        int rank = 1;
        for (Student s : trackerService.getAllStudents()) {
            System.out.println(String.format("%-5d | %s", rank++, s.toString()));
        }
        System.out.println("================================================");
    }

    private static void displayGradingCriteria() {
        System.out.println("\n=========== GRADING CRITERIA ===========");
        System.out.println("A  Grade : 90 - 100 Marks");
        System.out.println("B  Grade : 80 - 89.9 Marks");
        System.out.println("C  Grade : 70 - 79.9 Marks");
        System.out.println("D  Grade : 60 - 69.9 Marks");
        System.out.println("F  Grade : 0  - 59.9 Marks (Fail)");
        System.out.println("----------------------------------------");
        System.out.println("Note: Passing marks are set to 60.");
        System.out.println("========================================");
    }

    private static String getValidNameInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Error: Name cannot be empty.");
                continue;
            }

            if (input.matches("^[a-zA-Z\\s]+$")) {
                return input;
            } else {
                System.out.println("Error: Invalid name! Please use only alphabets.");
            }
        }
    }

    private static int getIntInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid whole number.");
            }
        }
    }

    private static double getDoubleInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid decimal or whole number.");
            }
        }
    }
}