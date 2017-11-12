/* A program that uses Rational class
 * Suggested exercises:
 * - In class Rational add a method to generate a random rational number.
 * - In class Rational add methods to subtract, multiply and divide 
 *   rationals numbers and use them in the main method.
 * - In class Rational add a method that returns the floating point value of a rational number.  
 * - Generate three random rational numbers and compute their average as a rational number.
 * - In class Rational add a method to find the minimum/maximum of the two rational numbers.
*/

import java.util.Scanner;

class AddRationals {

  public static void main (String[] args)
  {
      String div;
      int a, b, c, d;
      Scanner scan = new Scanner(System.in);
     
      System.out.print("Type a rational number (a / b): ");
      a = scan.nextInt();
      div = scan.next("/");
      b = scan.nextInt();
      
      System.out.print("Type another rational number (c / d): ");
      c = scan.nextInt();
      div = scan.next("/");
      d = scan.nextInt();
      
      Rational p = new Rational(a,b); // p points to a new instance of Rational
      Rational q = new Rational(c,d); // q points to a new instance of Rational

      Rational r = p.sum(q); // no need of new here, sum returns a new Ratonal object

      System.out.println(p + " + " + q + " = " + r);
      r.reduce();
      System.out.println("Reduced sum is: " + r);
  }

}
