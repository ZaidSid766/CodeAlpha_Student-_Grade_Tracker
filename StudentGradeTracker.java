import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Welcome to the Student Grade Tracker!");

        System.out.print("How many grades would you like to enter? ");
        int numGrades = scanner.nextInt();


        while (numGrades <= 0) {
            System.out.print("Please enter a positive number of grades: ");
            numGrades = scanner.nextInt();
        }

        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade " + (i + 1) + " (0-100): ");
            int grade = scanner.nextInt();

            while (grade < 0 || grade > 100) {
                System.out.print("Invalid grade! Enter a valid grade (0-100): ");
                grade = scanner.nextInt();
            }

            grades.add(grade);
        }

        if (!grades.isEmpty()) {
            int sum = 0, highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) {
                    highest = grade;
                }
                if (grade < lowest) {
                    lowest = grade;
                }
            }

            double average = (double) sum / grades.size();
            
            System.out.println("Number of grades: " + grades.size());
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        } else {
            System.out.println("No grades were entered.");
        }

        scanner.close();
    }
}
