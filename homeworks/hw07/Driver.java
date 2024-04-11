//HW 7.4
// Driver.java The program should read in a filename as a command line argument. This file will list course information for all of the courses that a student has taken.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        // Check if filename is provided as command-line argument
        if (args.length == 0) {
            System.out.println("Error: Please provide the filename as a command-line argument.");
            return;
        }

        // Read the filename from command-line argument
        String filename = args[0];

        // Attempt to read the file
        try (Scanner scanner = new Scanner(new File(filename))) {
            // Loop through each line in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // Split the line by comma to get individual components
                String[] parts = line.split(",");

                // Extract data from parts array
                String courseName = parts[0].trim();
                String department = parts[1].trim();
                String instructorName = parts[2].trim();
                int courseNumber = Integer.parseInt(parts[3].trim());
                double grade = Double.parseDouble(parts[4].trim());
                char semester = parts[5].trim().charAt(0);
                int year = Integer.parseInt(parts[5].trim().substring(1));

                // Create an Instructor object
                Instructor instructor = new Instructor(instructorName, "", 0); // Dummy values for building and office number

                // Create a StudentCourse object
                StudentCourse course = new StudentCourse(courseName, department, instructor, grade, semester, year);

                // Process the course data (calculate GPA, etc.)
                processCourse(course);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in the file.");
        } catch (ArrayIndexOutOfBoundsException 
