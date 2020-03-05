package oops;

public class StudentMain {

    public static void main(String[] args)
    {
        // How to assign values to variables

        // Approach 1 - Using Reference variable
       /* Student student1 = new Student();

        student1.grade = 'A';
        student1.sid = 1;
        student1.sname = "Akshay";

        // Approach 2 - Using Calculation_methods
        student1.getValues(2, "Akshay Kumar", 'A');
        student1.display();*/

        // Approach 3 - Using Constructor
        Student student2 = new Student(2,"Kumar", 'A' );

    }
}
