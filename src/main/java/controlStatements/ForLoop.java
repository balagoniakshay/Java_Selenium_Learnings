package controlStatements;

public class ForLoop {

    /* For loop Syntax -- For loop is also called as Looping statements and Iterative

    for(initialization; condition; incrementation/decrementation;)
            {
            statements
            }
     */

    public static void main(String[] args) {

        // write a program to print 1 to 10 numbers;
        // 1,2,3,4,5,6,7,8,9,10
        int i;
        for (i=1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("****************************************************************");
        // write a program to print 1 to 10 numbers in descending order
        //10,9,8,7,6,5,4,3,2,1

        for (i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}
