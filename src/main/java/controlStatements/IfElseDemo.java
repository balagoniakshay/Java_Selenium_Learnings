package controlStatements;

public class IfElseDemo {

    /*
    IfElse is also called as Selection Statements
     */

    public static void main(String[] args) {

        // Write a program to check the number is Even or Odd number
        // To check certain condition, then we will use if/else condition

        int num=11;

        if (num%2==0){
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }

        System.out.println("/**************************************************/");

        // Write a program to check the largest of two numbers
        //Write a program to check the largest of three numbers


        int x = 100;
        int y = 200;
        int z = 250;

        if (x > y && x > z) {
            System.out.println("X is largest");
        }
        else if (y > x && y > z){
            System.out.println("Y is largest");
        }
        else
        {
            System.out.println("Z is largest");
        }

        System.out.println("/**************************************************/");

        // Write a program to print the Week number based on Week day and print name of the week

        int day = 9;

        if (day==1){
            System.out.println("Day is Sunday");
        }
        else if (day==2){
            System.out.println("Day is Monday");
        }
        else if (day==3){
            System.out.println("Day is Tuesday");
        }
        else if (day==4){
            System.out.println("Day is Wednesday");
        }
        else if (day==5){
            System.out.println("Day is Thursday");
        }
        else if (day==6){
            System.out.println("Day is Friday");
        }
        else if (day==7){
            System.out.println("Day is Saturday");
        }
        else
        {
            System.out.println("Invalid Week day");
        }
    }
}
