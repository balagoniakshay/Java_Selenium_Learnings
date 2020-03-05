package oops;

public class Calculation_methods {

    /*
    JAVA Methods:

    Java Calculation_methods contains logic
    1. not taking params, not returns outputs
    2. not taking params, returns outputs
    3. taking params, not returns outputs
    4. taking params, returns outputs
     */

    int x, y;


    //1. not taking params, not returns outputs
    void sum()
    {
        System.out.println(x+y);
    }

    //2. not taking params, returns outputs
    int add()
    {
        return x+y;
    }

    //3. taking params, not returns outputs
    void sub(int a, int b)
    {
        int result = a - b;
        System.out.println(result);
    }

    //4. taking params, returns outputs
    int multiply(int a, int b)
    {
        return (a * b);
    }


    public static void main(String[] args) {

        //1. not taking params, not returns outputs
        Calculation_methods cal = new Calculation_methods();
        cal.sum();

        //2. not taking params, returns outputs
        int result = cal.add();
        System.out.println(result);

        //3. taking params, not returns outputs
        cal.sub(20,10);

        //4. taking params, returns outputs
        System.out.println(cal.multiply(2,3));

    }

}
