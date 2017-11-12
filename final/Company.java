import java.util.Scanner;
public class Company
{
    public static void main (String[] args)
    { 
        String fname, lname;
        int ID;
        Employee [] emp = new Employee [10];
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 10 names (first last) and IDs (integer):");
        for (int i=0; i<emp.length; i++)
        {
            fname = scan.next();
            lname = scan.next();
            ID = scan.nextInt();
            emp[i] = new Employee(fname,lname,ID);
        }
        
        System.out.println("Employees:");
        for (int i=0; i<emp.length; i++)
            System.out.println(emp[i]);
    }
}