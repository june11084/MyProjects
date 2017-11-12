/*
 * Reading student records from the keyboard, counting and averaging
 * Suggested exercises:
 * - Replace the while loop with a do loop
 * - Replace the while loop with a for loop
 * - Use a sentinel value (special first_name or value of grage) for the stopping condition
 * - Ask the user whether to continue the loop.
 * - Do counting and averaging in grade intervals - excellent (> 89), ok [60,89], and failure (< 60)
 */
import java.util.Scanner;

public class StudentGrades
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String record = "", first_name, last_name;
        int n, grade, count=0, total = 0;
        double average;
        
        System.out.print("How many students? ");
        n = scan.nextInt();

        System.out.println("Enter first name, last name and grade separated by blanks");
        
        while (n>0)
        {
            first_name = scan.next();
            last_name = scan.next();
            grade = scan.nextInt();
            record = record.concat(first_name + " " + last_name + " " + grade + "\n");
            total = total + grade;
            n--;
            count++;
        }

        average = (double)total/count;
        System.out.println("The following students are entered:");
        System.out.println(record);
        System.out.println("The average grade is " + average);
    }
}
