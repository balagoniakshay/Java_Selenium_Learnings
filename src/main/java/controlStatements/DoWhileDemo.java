package controlStatements;

public class DoWhileDemo {

    /* Do While loop is also called as Looping statements and Iterative
    do...while syntax
    do
    {
    statements;
    }
    while(condition);
     */

    public static void main(String[] args) {

        // Write a program to print 1 to 10 numbers
        // 1,2,3,4,5,6,7,8,9,10

        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<=10);
    }
}
