package oops;

public class Student {

    int sid;
    String sname;
    char grade;

    void display() // display() is method - method name always starts with lowerCase
    {
        System.out.println(sid);
        System.out.println(sname);
        System.out.println(grade);
    }

    void getValues(int id, String name, char grade) //id, name and grade are arguments/parameters and they are method varaibles
    {
        sname = name;
        sid = id;
        grade = grade;
    }

      /*
        What is java constructor?
        1. It is special type of method
        2. It name should be as class name.
        3. Constructor will automatically invoked at the object creation
        4. Only for initialize the object
        5. 2 types - a. default constructor b. parameter constructor
        6.
         */

      Student(int id, String name, char g)
      {
          sid = id;
          sname = name;
          grade = g;
      }
}
