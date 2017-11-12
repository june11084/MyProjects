public class Employee
{
    private String fname, lname;
    private int ID;
    
    public Employee(String fn, String ln, int IDnum)
    {
        fname = fn;
        lname = ln;
        ID = IDnum;
    }

    public String toString()
    {
        return fname + " " + lname + "\t" + ID;
    }
}
