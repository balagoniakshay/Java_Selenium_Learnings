package oops;

public class MethodOverloadingDemo {

    /*
    1. Number of parameters should be different
    2. If the number of parameters are same then data type should be different
     */

   int x, y;
   double z;

   int addition(){
       x=10;
       y=20;
       return x+y;
   }

   int addition(int a, int b){
       x=a;
       y=b;
       return x+y;
   }

    double addition(int a, int b, double c){
        x=a;
        y=b;
        z=c;
        return x+y+z;
    }

    public static void main(String[] args) {

       MethodOverloadingDemo methods = new MethodOverloadingDemo();
        System.out.println(methods.addition());
        System.out.println(methods.addition(10,20));
        System.out.println(methods.addition(10, 20, 30.5));

    }


}
