package exercises.lessontwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapPractice {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Id : ");
                Integer newId = input.nextInt();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " has id: " + student.getValue());
        }
    }

}
