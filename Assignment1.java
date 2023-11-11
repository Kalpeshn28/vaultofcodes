import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_STUDENTS = 50;
        String[] studentNames = new String[MAX_STUDENTS];
        int[] studentGrades = new int[MAX_STUDENTS];
        int totalStudents = 0;

        while (true) {
            System.out.println("Student Grade Tracker \n Use Option to : ");
            System.out.println("1. Add new student and grade");
            System.out.println("2. View list of students and grades");
            System.out.println("3. Calculate and display average grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (totalStudents < MAX_STUDENTS) {
                        System.out.print("Enter student name: ");
                        String name = scanner.next();
                        System.out.print("Enter student grade: ");
                        int grade = scanner.nextInt();

                        studentNames[totalStudents] = name;
                        studentGrades[totalStudents] = grade;
                        totalStudents++;

                        System.out.println(name + " has been added with a grade of " + grade);
                    } else {
                        System.out.println("Maximum number of students reached. Cannot add more.");
                    }
                    break;

                case 2:
                    if (totalStudents == 0) {
                        System.out.println("No students in the list.");
                    } else {
                        System.out.println("List of Students and Grades:");
                        for (int i = 0; i < totalStudents; i++) {
                            System.out.println(studentNames[i] + ": " + studentGrades[i]);
                        }
                    }
                    break;

                case 3:
                    if (totalStudents == 0) {
                        System.out.println("No grades available to calculate average.");
                    } else {
                        int total = 0;
                        for (int i = 0; i < totalStudents; i++) {
                            total += studentGrades[i];
                        }
                        double average = (double) total / totalStudents;
                        System.out.println("Average Grade: " + average);
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
