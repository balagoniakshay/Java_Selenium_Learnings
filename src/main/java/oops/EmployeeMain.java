package oops;

public class EmployeeMain {

    public static void main(String[] args) {

        //objects should be created in main method

        Employee emp1 = new Employee(); // new Employee() is an instance , it is an object; emp1 is a reference variable;
        emp1.eid = 100;
        emp1.deptno = 10;
        emp1.ename = "Akshay";
        emp1.job = "SDET";

        emp1.display();

        System.out.println("*************************************************************");

        Employee emp2 = new Employee();
        emp2.eid = 101;
        emp2.deptno = 20;
        emp2.ename = "Kumar";
        emp2.job = "SDET";

        emp2.display();

        System.out.println("*************************************************************");
    }
}
