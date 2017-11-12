/* Calculate the sum of the series 1/1+1/2+1/3+...+1/N in rational numbers 
 * Suggested exercises:
 * - include reduction in the loop and compare sums
 * - change 10 to 15 and compare sums (explain the differences)
 * - add a getDecimal() method to Rational and use it in the loop
 * - add a counter in the Rational class to count the number of instances
 * - use a while loop to find out the first i for which sum > 3.5
 */
class Series1 {

  public static void main (String[] args)
  {
     Rational r = new Rational (0,1); // initialize the fraction sum with 0/1
     double s = 0;                    // initialize the decimal sum with 0
     for (int i=1; i<=10; i++) 
     {
       r = r.sum(new Rational(1,i));
       s = s + (double)1/i;
       System.out.println(r + "\t" + (double)r.getNumerator()/r.getDenominator() + "\t" + s);
     }
     r.reduce();
     System.out.println("Reduced: " + r + "\t" + (double)r.getNumerator()/r.getDenominator());
   }
}
