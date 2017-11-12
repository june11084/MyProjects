package Project4;

/**
 * Jun Li
 * june11084@gmail.com
 * Computer Science 1,151-01 
 */

import java.util.Random; //imports random utility
import java.util.Scanner; // imports scanner utility
public class Project4 // class headers
{
    // class body
    public static void main (String [] args)
    {
        int x; // declaring variable
        System.out.print("Please enter a number bigger than 3: "); //prompts user input larger than 3
        Scanner scan = new Scanner(System.in); //initiates new scanner 
        int input = scan.nextInt(); // scans the next integral input
        Random gen = new Random(); // initiates new random generator
        System.out.print("Rational numbers: "); // prints "Rational numbers"

        Rational sum = new Rational(0,1); // has to be from 0 to 1
        Rational maximum = new Rational(-9999,1);// has to be from any - to 1
        Rational minimum = new Rational(9999,1); // has to be from any + to 1
        Rational divisor = new Rational(input,1); // has to be from input to 1

        if(input>3) //if user input is bigger than 3, it will continue with code
        {
            for (x = 0;x<input;x++) // for loop statement if parameter is met
            {
                int ranDen = gen.nextInt(9)+1; // generates random denominator less than 10
                int ranNum = gen.nextInt(ranDen); // generates random numerator less than the denominator 
                Rational one = new Rational(ranNum,ranDen);// creates a proper fraction
                System.out.print(one); // prints the fraction
                if(x<input-1) // prints a comma if x is less than input -1, so it won't print on last fraction
                    System.out.print(", ");

                maximum = maximum.max(one);  //calls method max     
                minimum = minimum.min(one); // calls method min
                sum = sum.sum(one); //calls method sum
                sum.reduce(); //reduces the sum to lowest term
                Rational average = sum.divide(divisor); // gets the sum by dividing by input
                average.reduce();// reduces the average to lowest term
                if(x==input-1) //if x reaches end of loop times depending on user input, prints below
                {
                    System.out.println();    
                    System.out.println("Maximum: " + maximum + " (" + maximum.tofloat() + ")"); 
                    System.out.println("Minimum: " + minimum + " (" + minimum.tofloat() + ")");
                    System.out.println("Sum: " + sum + " (" + sum.tofloat() + ")");
                    System.out.println("Average: " + average + " (" + average.tofloat() + ")");
                }

            }
        }
        else //if user input is 3 or less, it well print an error warning
        {
            System.out.println("input is less than or equal to 3, please enter a number larger than 3 ");
        }
    }

}
