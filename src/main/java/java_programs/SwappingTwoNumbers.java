package java_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwappingTwoNumbers {

    public static void main(String[] args) {

        int a=10, b=20;

        System.out.println("Before swapping, values are " + a+ "," + b);

       /* //Logic 1 - Third variable
        int c=a;
        a=b;
        b=c;

        System.out.println("After swapping, values are " +a+ "," + b);*/

        //Logic 2 - + and -
      /*  a = a +b;
        b= a-b;
        a=a-b;
        */

      //logic 3
     /*   a=a*b;
        b=a/b;
        a=a/b;
*/

     //logic 4 //a = 10 , b =20
        b=a+b - (a=b);

        System.out.println("After swapping, values are " +a+ "," + b);

    }




}
