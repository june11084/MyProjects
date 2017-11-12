/**
 * Jun Li
 * june11084@gmail.com
 * Computer Science 1,151-01 
 */
import java.util.Scanner;
import java.io.*;

public class Students
{
    public static void main (String[] args) throws IOException  //method body
    {   String first_name, last_name;  // declaring variables
        int grade;
        Scanner fileInput = new Scanner(new File("students.txt")); //scans text file with student name and grades
        while (fileInput.hasNext()) // loop while text file has next()
        {
            first_name = fileInput.next(); 
            last_name = fileInput.next();   //scans first name last name then grade
            grade = fileInput.nextInt();

            Student st = new Student(first_name, last_name, grade); //creates a new object

            //st.extrema(); //initiates student.extrema 
            System.out.println(st); // prints the student list after conversion

        }
        System.out.println(); //skip a line
        System.out.println("There are " + Student.getCount() + " students with average grade " + Student.getAverage()); //prints total number of student and grade average
        System.out.println("There are " + Student.getExCount() + " excellent students with average grade " + Student.getExAverage()); //prints number of excellent student and avg
        System.out.println("There are " + Student.getOkCount() + " ok students with average grade " + Student.getOkAverage());//prints number of ok student and grade average
        System.out.println("There are " + Student.getFailureCount() + " failure students with average grade " + Student.getFailureAverage());//prints failed students and average
        System.out.println("The student with the highest grade is " + Student.getHighest()); // prints the name and grade of the student with highest grade 
        System.out.println("The student with the lowest grade is " + Student.getLowest()); // prints the name and grade of the student with lowest grade
    }
}
