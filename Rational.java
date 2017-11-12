xpackage Project4;

// A class representing rational numbers

class Rational {

    private int numerator;
    private int denominator;

    public Rational (int a, int b) // declaring fraction
    {
        numerator = a; 
        denominator = b;
    }

    public Rational sum (Rational r) //sum method
    {
        int num, den;
        den = denominator * r.getDenominator();
        num = numerator * r.getDenominator() + r.getNumerator() * denominator;
        return new Rational (num, den);
    }

    public Rational divide (Rational r) //division method
    {
        int num, den;
        den = denominator * r.getNumerator();
        num = numerator * r.getDenominator();
        return new Rational (num, den);
    }

    public float tofloat ()  //method to return converted float number
    {
        return (float)numerator/denominator;
    }

    public Rational max (Rational r) // compares fractions and returns biggest fraction
    {
        int num, den;

        double decimalA, decimalB;
        decimalA = (double)numerator/denominator;
        decimalB = (double)r.getNumerator()/r.getDenominator();
        if (decimalA >= decimalB) 
        {
            num = numerator ;
            den = denominator ;
        }
        else
        {
            num = r.getNumerator();
            den = r.getDenominator();
        }

        return new Rational (num, den);
    }

    public Rational min (Rational r) // compares fractions and returns smallest fraction
    {
        int num, den;

        double decimalA, decimalB;
        decimalA = (double)numerator/denominator;
        decimalB = (double)r.getNumerator()/r.getDenominator();
        if (decimalA <= decimalB)
        {
            num = numerator ;
            den = denominator ;
        }
        else
        {
            num = r.getNumerator();
            den = r.getDenominator();
        }

        return new Rational (num, den);
    }

    public int getNumerator() { return numerator; } 

    public int getDenominator() { return denominator; }

    public String toString () { return numerator + "/" + denominator; }

    public void reduce() {   
        // reduces fractions to lowest term
        int factor;
        factor = gcd(numerator, denominator);
        numerator = numerator / factor;
        denominator = denominator / factor;
    }

    private int gcd (int x, int y) {

        int t;
        while (y>0)
        {
            t = x % y;
            x = y;
            y = t;
        }
        return x;
    }

}
