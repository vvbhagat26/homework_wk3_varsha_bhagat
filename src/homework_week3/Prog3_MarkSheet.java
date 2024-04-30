package homework_week3;

import java.util.Scanner;

public class Prog3_MarkSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter marks for Math (0-100): ");
        int mathMarks = scanner.nextInt();
        validateMarks(mathMarks);

        System.out.print("Enter marks for Science (0-100): ");
        int scienceMarks = scanner.nextInt();
        validateMarks(scienceMarks);

        System.out.print("Enter marks for English (0-100): ");
        int englishMarks = scanner.nextInt();
        validateMarks(englishMarks);

        // Calculate total marks and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 300.0) * 100;

        // Determine pass/fail and grade
        String result;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                result += " (A+)";
            } else if (percentage >= 60) {
                result += " (A)";
            } else if (percentage >= 50) {
                result += " (B)";
            } else {
                result += " (C)";
            }
        } else {
            result = "Fail";
        }

        // Print Mark Sheet
        System.out.println("'' ----------------------------------''");
        System.out.println("''|                Mark sheet               |''");
        System.out.println("'' +----------------------------------+''");
        System.out.println("    |         Name: " +  studentName             +                         "|");
        System.out.println("    |         Roll Number: " + rollNumber        +                         "|");
        System.out.println("    |        Math Marks: " + mathMarks            +                      "|");
        System.out.println("    |      Science Marks: " + scienceMarks        +                    "|");
        System.out.println("    |       English Marks: " + englishMarks       +                    "|");
        System.out.println("    |          Total Marks: " + totalMarks         +                "|");
        System.out.println("    |          Percentage: " + percentage         +                  "|");
        System.out.println("    |          Result: " + result                 +                   "|");

        scanner.close();
    }

    public static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Input! Marks should be between 0 and 100.");
            System.exit(1); // Exit the program
        }
    }
}
