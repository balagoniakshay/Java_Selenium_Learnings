package oops;

public class StaticKeywordDemo {

    /*
    1. To Overcome duplication
    2. If you modify the value in one place it will effected to all the places in the class - Static variables are common for all the objects.
    3. Static can be applied for both variables and methods
    4. When to use static: if you find something is common for all the objects then we can use static keyword

    Static Variables, Methods:
        1. A variable is which defined static are called static variables
        2. A Method is called Static method when i define static keyword before the method name
        3. Static variable, method can access all other static variables and methods directly
     */

    static int a = 10; // static variable

    int b = 20; // non-static variable

    static void m1() // static method
    {

        System.out.println("I'm static method");

    }

    void m2() // non-static method
    {

        System.out.println("I'm not non-static method");
        System.out.println("I'm from non-static method " + a); // Here Non-static method can access everything(non-static and static variables, methods)
        System.out.println("I'm from non-static method " + b);

    }

    public static void main(String[] args) {

        System.out.println("I'm static variable " + a); // static method can call static variables directly
        m1(); // static methods can call other static methods directly

        //System.out.println(b); // static method cannot call non-static variable directly
        //m2(); // static method cannot call non-static methods directly

        StaticKeywordDemo staticKeywordDemo = new StaticKeywordDemo();
        System.out.println("I'm non-static variable " + staticKeywordDemo.b); // To call non static variable you need to create object.

        System.out.println("**********************************************************************");
        staticKeywordDemo.m2();//To call non static method you need to create object

    }



}
