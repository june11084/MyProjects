public class Student
{
    private String fname, lname; 
    private int grade;
    private static int totalgrade = 0;
    private static int totalexgrade = 0;
    private static int totalokgrade = 0;
    private static int totalfailuregrade = 0;  // declaring all variable with encapsulations
    private static int count = 0;
    private static int excount = 0;
    private static int okcount = 0;
    private static int failurecount = 0;
    // private static Student highest = new Student("Mike" ,"tyson" ,0),lowest = new Student("Mike" ,"tyson" ,100);;
    public Student(String fname, String lname, int grade) //parameter for name and grade
    {
        this.fname = fname;
        this.lname = lname;
        this.grade = grade;
        count = count + 1;
        if(grade>89) //counts the number of excellent students by their grade range
        {
            excount = excount + 1;
        }
        if(grade>64 && grade<90) //counts the number of ok students 
        {
            okcount = okcount + 1;
        }
        if(grade<65) //counts the number of failed students
        {
            failurecount = failurecount + 1;
        }

        totalgrade = totalgrade + grade;
        if(grade>89) //calculates the combined grades of excellent students
        {
            totalexgrade = totalexgrade + grade;
        }
        if(grade>64 && grade<90) //calculates the combined grades of ok students
        {
            totalokgrade = totalokgrade + grade;
        }
        if(grade<60)  //caluculates the combined grades of failed students
        {
            totalfailuregrade = totalfailuregrade + grade;
        }
    }

    public static int getTotal() //get combined grade of all students
    {
        return totalgrade;
    }

    public static int getExTotal() //gets combined grades of excellent students
    {
        return totalexgrade;
    }

    public static int getOkTotal() //gets combined grades of ok students
    {
        return totalokgrade;
    }

    public static int getFailureTotal() //gets combined grades of failed students
    {
        return totalfailuregrade;
    }

    public static int getCount() // gets the number of all students
    {
        return count;
    }

    public static int getExCount() //gets the number of excellent students
    {   
        return excount;
    }

    public static int getOkCount() //gets the number of ok students
    {   
        return okcount;
    }

    public static int getFailureCount() //gets the number of failed students
    {   
        return failurecount;
    }

    public static double getAverage() // gets the average of all student grades
    {
        return (double)totalgrade/count;
    }

    public static double getExAverage() // gets the average of excellent student grades
    {
        return (double)totalexgrade/excount;
    }

    public static double getOkAverage() // gets the average of ok student grades
    {
        return (double)totalokgrade/okcount;
    }

    public static double getFailureAverage() //gets the average of failed student grades
    {
        return (double)totalfailuregrade/failurecount;
    }

    public String toString() //string to type conversion
    {
        String type="";

        if(grade>89) 
            type = " excellent";
        if(grade>64 && grade<90)
            type = " ok";
        if(grade<60)
            type = " failure";
        return fname + " " + lname + " " + grade + " " + type;
    }

//     public void extrema() //gets the student with highest and lowest grades
//     {
//         if(highest.grade<grade)
//         {
//             highest = this ;
// 
//         }
//         if(lowest.grade>grade)
//         {
//             lowest = this;
// 
//         }
//     }
// 
//     public static Student getHighest() // highest getter for extrema
//     {
//         return highest;
//     }
// 
//     public static Student getLowest() // lowest getter for extrema
//     {
//         return lowest;
//     }

}

