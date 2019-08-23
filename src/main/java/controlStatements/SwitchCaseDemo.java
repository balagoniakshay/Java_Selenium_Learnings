package controlStatements;

public class SwitchCaseDemo {

    /*
    SwitchCase is called Conditional/ Selection statements.
    syntax

     */

    public static void main(String[] args) {
        int day = 10;

        // If number of conditions is more then it is better to use SwitchCase statement instead of IfElse to Reduce the code

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid week day");
                break;
        }

    }
}
