/**
 * Jun Li
 * june11084@gmail.com
 * Computer Science 1,151-01 
 */
import java.util.Scanner;
import java.io.*;

public class Students //class body
{
    public static void main (String[] args) throws IOException //method body
    {   String first_name, last_name; //declares first name and last name as string variable
        int grade,count = 0; //set default grade and count to 0/initialize
        Student[] st = new Student [20]; //creats st student array
        Scanner fileInput = new Scanner(new File("students.txt")); //scans students text file
        Scanner scan = new Scanner(System.in); // initializes new scanner 
        System.out.println("Please type your command"); //prompts user to type a command
        while (fileInput.hasNext()) // loop while there is something in student text file
        {
            
            first_name = fileInput.next(); // scans for first name
            last_name = fileInput.next(); // scans for last name
            grade = fileInput.nextInt(); // scans for grade

            st[count] = new Student(first_name, last_name, grade); //array of st student

            count++; // count + 1 per loop repeat
        }

        while(count==count) //loop while something is always true
        {
            String input = scan.next(); //scans for which command to compute
            if(input.equals("printall")) //if the scanned string is printall, prints all students info
                pr(st,count);

            if(input.equals("firstname")) // if scanned firstname, scans again for first name letters and calls firstName method
            {
                String name = scan.next();
                firstName(st,count,name);
            }

            if(input.equals("lastname"))//if scanned lastname, scans again for last name letters and calls lastName method
            {
                String name = scan.next();
                lastName(st,count,name);
            }

            if(input.equals("sort")) // if scaned sort, calls bubbleSort method
                bubbleSort(st,count);

            if(input.equals("interval"))// if scaned interval, scanes two more times for int a and b, then calls prInterval method
            {
                int a = scan.nextInt();
                int b = scan.nextInt();
                prInterval(st,count,a,b);
            }

            if(input.equals("end"))// ends the program by breaking out
            {
                break;
            }
        }

    }

    public static void prInterval(Student[] arr,int n,int a, int b)//print interval method,student array parameter
    {
        for(int i=0; i<n; i++)//loop when i is less than n and increase 1 each repetition
            if(arr[i].getGrade() >=a && arr[i].getGrade() <= b)
                System.out.println(arr[i]);  // prints all students and their info
    }

    public static void firstName(Student[] arr,int n,String name) //firstname method, scans for first name letter patterns
    {
        for(int i=0; i<n; i++)
            if((arr[i].getFname()).indexOf(name)==0)
                System.out.println(arr[i]); //prints all students with matching user imput for first name letters
    }

    public static void lastName(Student[] arr,int n,String name)//lastname method, scans for last name letter patterns
    {
        for(int i=0; i<n; i++)
            if((arr[i].getLname()).indexOf(name)==0)
                System.out.println(arr[i]);//prints all students with matching user imput for last name letters
    }

    public static void pr(Student[] arr,int n)//print all students method
    {
        for(int i=0; i<n; i++)
            System.out.println(arr[i]); //prints all students and their info
    }

    public static void bubbleSort(Student[] a,int n)//bubblesort method
    {

        int swaps;// declaring int variable
        Student t; // delcaring Student t
        do {//loop while swaps is bigger than 0
            swaps = 0; 
            for (int i=0; i<n-1; i++) 
                if (a[i].getGrade()>a[i+1].getGrade()) {
                    t=a[i]; //temporary value
                    a[i]=a[i+1]; //signs a new value
                    a[i+1]=t;  //replaces temporary value with new value
                    swaps++; // increments the number of each times temporary value is replaced by 1
            }
        } while (swaps>0);
        pr(a,n);//prints all students again after sorted
    }
}
