package oops;


/*
Class is logical entity - Does not require memory because it is logical entity(Blue print of object)
Object is physical entity - Requires memory since it is physical entity(Real entity)

Class contains variables and Calculation_methods
Object is an instance of a class

We can create any number of objects for a single class
Objects are independent

*/

public class Employee {

    // Class Variables

    int eid; //variable - employee id
    String ename; // Variable -  employee name
    int deptno; // Variable - department number
    String job;

    // Calculation_methods
    void display() // void does not return any output and display() is the method name
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(deptno);
        System.out.println(job);
    }

}
