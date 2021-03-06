// A class representing rational numbers

class Rational {

   private int numerator;
   private int denominator;

   public Rational (int a, int b) 
   {
        numerator = a; 
        denominator = b;
   }

   public Rational sum (Rational r) 
   {
       int num, den;
       den = denominator * r.getDenominator();
       num = numerator * r.getDenominator() + r.getNumerator() * denominator;
       return new Rational (num, den);
   }

   public int getNumerator() { return numerator; }

   public int getDenominator() { return denominator; }

   public String toString () { return numerator + "/" + denominator; }

   public void reduce() {

      int factor;
      factor = gcd(numerator, denominator);
      numerator = numerator / factor;
      denominator = denominator / factor;
   }

   private int gcd (int x, int y) {

      int t;
      while (y>0) {
        t = x % y;
        x = y;
        y = t;
      }
      return x;
   }

}
