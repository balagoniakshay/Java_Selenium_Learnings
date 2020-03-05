package java_programs;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = sc.nextInt();

        // ReverseNumber a number - Using String buffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("The reverse number is: " + rev);


        //Using String builder class
        StringBuilder sbuilder = new StringBuilder();

        sbuilder.append(num);

        sbuilder.reverse();

        System.out.println("The reverse number is: " + rev);


    }
}
