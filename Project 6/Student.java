public class Student
{
    private String fname, lname;
    private int grade;

    public Student(String fname, String lname, int grade)//parameter for name and grade
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
    }

    public String toString() //converts into string
    {
        return fname + " " + lname + "\t" + grade;
    }

    public String getFname() //retuns fname
    {
        return fname;
    }

    public String getLname()//returns lname
    {
        return lname;
    }

    public int getGrade()// returns grade
    {
        return grade;
    }
}
