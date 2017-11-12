/**
 * Jun Li
 * june11084@gmail.com
 * Computer Science 1,151-01    <- javadoc comment      
 * 3/08/2016
 */
import java.util.Scanner;
public class Type    /** class header */
{
    /** class body */
    public static void main (String[] args) /** method header */
    {
        Scanner scan = new Scanner(System.in); /**Instantiate a Scanner object*/
        String record = "", first_name, last_name; /**declaring string record */
        int MOB, YOB, Months, Years, MonthsLived; /** declaring integer variables */
        final int CurrentMonth = 3;  /** declaring integer that should not be changed*/
        final int CurrentYear = 2016; /** declaring integer that should not be changed*/

        System.out.print("Please enter your first name, last name seperated by blank: ");  /** prompts user to enter first and last name seperated by space):" */ 
        first_name = scan.next();  /**Reads or scans user input first name */
        last_name = scan.next();   /**Reads or scans user input last name */

        System.out.println("Enter Month of Birth: "); /** prompts user to enter month of birth */
        MOB = scan.nextInt();  /**Reads or scans user input integer(month of birth) */
        if (MOB>0 && MOB<13)  /** If user input integer is bigger than 0 and less than 13, system will print and prompts user to enter year of Birth */
        {
            System.out.print("Enter Year of Birth: ");

        }
        else                 /** If user input integer is NOT bigger than 0 and less than 13, system will print "Wrong Month of Birthday" and stop */
            System.out.println("Wrong Month of Birthday"); 
        YOB = scan.nextInt(); /**Reads or scans user input integer(year of birth) */
        if (YOB>1899 && YOB<2017) /** If user input integer is bigger than 1899 and less than 2017, system will calculate how old the user are */
        {
            MonthsLived = CurrentMonth + CurrentYear * 12 - MOB - YOB * 12;
            Months = MonthsLived % 12;  /** Remainder from integer division( how old in months) */
            Years = MonthsLived / 12;   /** Integer division of user age(how old in years) */   
            if (Years>65) /** If user age(years) is bigger than 65, system will print the "name of user, you are x years and x month old, You are a senior */
            {
                System.out.println(first_name + " " + last_name + "," + "You are " + Years + " years and " + Months +" months old" + ","  + "You are a senior");
            }
            if (Years<66 && Years>17) /** If user age(years) is less than 66 and bigger than 17, system will print the "name of user, you are x years and x month old, You are an adult */
            {
                System.out.println(first_name + " " + last_name + "," + "You are " + Years + " years and " + Months +" months old" + ","  + "You are an adult");
            }
            if (Years<18) /** If user age(years) is less than 18, system will print the "name of user, you are x years and x month old, You are a kid */
            {
                System.out.println(first_name + " " + last_name + "," + "You are " + Years + " years and " + Months +" months old" + ","  + "You are a kid");
            }
        }
        else  /** If user input integer is NOT bigger than 1899 and less than 2017, system will print "Wrong year of Birth" and stop */
        {
            System.out.print("Wrong year of Birth"); 
        }
        /** end of class body */
    } /** End of statement/declaration/ (includes :class, interface,method, constructor) */

}
