import java.util.Scanner;
/**
 * Jun Li
 * june11084@gmail.com
 * Computer Science 1,151-01    <- javadoc comment
 * */
class Fraction  /** class header */
{
    /** class body */
    public static void main (String[] args) {    /** method header */
        int num1, den1, num2, den2, int1, int2, int3, int4, rem1, rem2, rem3, rem4;  /** declaring integer variables */
        Scanner scan = new Scanner(System.in);  /**Instantiate a Scanner object*/
        int resnum, resnum1, resnum2, resnum3, resden, resden1, resden2, resden3;  /** Declaring integer variables of fraction equations*/

        System.out.print("Enter a fraction (integer / integer):");     /** prints "Enter a fraction (integer / integer):" */
        /**Reads or scans user input fraction (integer / interger)*/
        num1 = scan.nextInt();
        scan.next("/");
        den1 = scan.nextInt();


        System.out.print("Enter another fraction (integer / integer): "); /** prints "Enter another a fraction (integer / integer):" */
        /**Reads or scans user input fraction (integer / interger)*/
        num2 = scan.nextInt();
        scan.next("/");
        den2 = scan.nextInt();


        System.out.println("Result as fraction and mixed number");
        resnum = num1*den2 + num2*den1; /** addition */
        resnum1 = num1*den2 - num2*den1; /** subtraction */
        resnum2 = num1*num2; /** multiplication */
        resnum3 = num1*den2; /** division */
        resden = den1*den2;  /** numerator of (+,-,*) */
        resden1 = den1*num2; /** numerator of division */

        int1 = resnum / resden; /** Compute the quotient (the whole number) by integer division */
        int2 = resnum1 / resden;
        int3 = resnum2 / resden;
        int4 = resnum3 / resden1;
        rem1 = resnum % resden; /** Compute the remainder (the numerator of the proper fraction) */
        rem2 = resnum1 % resden;
        rem3 = resnum2 % resden;
        rem4 = resnum3 % resden;
        /** shows fractional results */
        System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + resnum + "/" + resden + " = " + int1 + " " + rem1 + "/" + resden);
        System.out.println(num1 + "/" + den1 + " - " + num2 + "/" + den2 + " = " + resnum1 + "/" + resden + " = " + int2 + " " + rem2 + "/" + resden);
        System.out.println(num1 + "/" + den1 + " * " + num2 + "/" + den2 + " = " + resnum2 + "/" + resden + " = " + int3 + " " + rem3 + "/" + resden);
        System.out.println(num1 + "/" + den1 + " / " + num2 + "/" + den2 + " = " + resnum3 + "/" + resden1 + " = " + int4 + " " + rem4 + "/" + resden1);

        System.out.println("Result as floating point number");

        /** Compute the decimal (floating point) value of fractions */

        float sum, difference, product, remainder, input1, input2 ; /** Declaring float variables */
        input1 = num1/(float)den1; /** user input fraction in decimal */
        input2 = num2/(float)den2;
        sum = num1/(float)den1 + num2/(float)den2;   /** sum of two user inputs in decimal */
        difference = num1/(float)den1 - num2/(float)den2; /** difference of two user inputs in decimal */
        product = num1/(float)den1 * num2/(float)den2;   /** product of two user inputs in decimal */
        remainder = num1/(float)den1 / num2*den2;        /** quotient of two user inputs in decimal */
        /** shows decimal results */
        System.out.println(input1 + " " + "+" + " " + input2 + " " + "=" + " " + sum);
        System.out.println(input1 + " " + "-" + " " + input2 + " " + "=" + " " + difference);
        System.out.println(input1 + " " + "*" + " " + input2 + " " + "=" + " " + product);
        System.out.println(input1 + " " + "/" + " " + input2 + " " + "=" + " " + remainder);
        System.out.println("congrats");
    }
    /** end of class body */
}
