package controlStatements;


public class WhileLoop {

    /*
    While loop is also called as Looping statements and Iterative
    syntax:
     While(condition)
        {
        statements
     */

    public static void main(String[] args) {

       // Write a program to print 1 to 10 numbers
        int i= 10;

//        int i = 2;
//        while(i<=10){
//            System.out.println("The number is " +i);
//            i++;
//        }

//        // write a program to print only even number from 1 to 10
//        while (i<=10){
//            System.out.println("The even number is " +i);
//            i = i+2;
//        }
//
//        while (i<=10){
//            System.out.println("The odd number is " +i);
//            i = i+ 1;
//        }
//
        // write a program to print 10 to 1 in numbers - descending order

        while (i>=1){
            System.out.println("The numbers in descending order " + i);
            i--;
        }

    }
}
