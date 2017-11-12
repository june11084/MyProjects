public class Bank
{
    
    public static void main()
    {
        double balance = 2000;
        
        System.out.println("Month   Balance");
        
        for (int i=1; i<=12; i++)
        {
            balance = balance + balance*0.015 - 150;
            System.out.println(i + "\t" + balance);
        }
        
    }
}         