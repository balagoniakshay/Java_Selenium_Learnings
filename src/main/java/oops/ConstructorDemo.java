package oops;

public class ConstructorDemo {

    int x,y,z;

    ConstructorDemo() //this is called default because of no parameters
    {
        x= 10;
        y=20;
        System.out.println("this is default constructor " + (x+y));
    }

    ConstructorDemo(int a, int b) // this is parameterized constructor
    {
        x=a;
        y=b;
        System.out.println("this is parameterized constructor " + (x+y));
    }

    ConstructorDemo(int a, int b, int c) // this is parameterized constructor with three parameter
    {
        x=a;
        y=b;
        z=c;
        System.out.println("this is parameterized constructor " + (x+y+z));
    }

    public static void main(String[] args) {
        ConstructorDemo constructorDemo = new ConstructorDemo();

        ConstructorDemo constructorDemo1 = new ConstructorDemo(10,20);

        ConstructorDemo constructorDemo2 = new ConstructorDemo(10,20,30);
    }


}
