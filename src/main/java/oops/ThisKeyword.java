package oops;

/*
    1. To differentiate class variables and method variables
    2. To use same class variables as method variables
    3. Why not use different variables: When we use different variables it will create memory location, to avoid that we will use this keyword
 */

public class ThisKeyword {

    int a, b;

  /*ThisKeyword(int a, int b){
        this.a = a;
        this.b = b;
    }*/
    void add(int a, int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {

//        ThisKeyword thisKeyword = new ThisKeyword(1,2);
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.add(10,20);
        System.out.println(thisKeyword.a);
        System.out.println(thisKeyword.b);
        System.out.println("The sum of a and b is " + (thisKeyword.a + thisKeyword.b));

    }
}
