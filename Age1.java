/**
 * Computes the age based on MOB and YOB
 * Suggested exercises:
 * - Validate YOB
 * - Validate the type the input. 
 *   Use Type.isInteger(input) and Integer.valueOf(input) (see CheckInput.java)
 * - Sort the age into three intevals: kid (<=18), adult (18,65), senior (>=65)
 * - Add a happy birthday message
 */
import java.util.Scanner;
public class Age1
{
    public static void main (String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int MOB, YOB, Months, Years, MonthsLived;
        final int CurrentMonth = 3;
        final int CurrentYear = 2016;

        System.out.print("Enter Month of Birth: ");
        MOB = scan.nextInt();
        if (MOB>0 && MOB<13)
        {
            System.out.print("Enter Year of Birth: ");
            YOB = scan.nextInt();
            MonthsLived = CurrentMonth + CurrentYear * 12 - MOB - YOB * 12;
            Months = MonthsLived % 12;  // Remainder from integer division 
            Years = MonthsLived / 12;   // Integer division 
            System.out.println("You are " + Years + " years and " + Months +" months old");
        }
        else
            System.out.println("Wrong Month of Birth");
    }
}
