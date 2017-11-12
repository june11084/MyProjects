/*
 * Illustrates method overloading and local variables
 */

public class Scope
{
    public static void main (String[] args)
    {
        int x = 5;
        Num a = new Num(5);
        Num b = new Num(5);
        
        System.out.println("Before add10(int x): " + x);
        add10(x);
        System.out.println("After add10(int x): " + x);
        
        System.out.println("b = " + b);
        
        System.out.println("Before add10 (Num a): " + a);
        add10(a);
        System.out.println("After add10 (Num a): " + a);
        
        System.out.println("b = " + b);
        
        
    }
    
    public static void add10 (int x)
    {
        x = x + 10;
    }
    
    public static void add10 (Num x)
    {
        int y = x.getValue();
        x.setValue(y + 10);
    }
}

