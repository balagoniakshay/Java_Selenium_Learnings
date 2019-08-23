package javaBasics;

public class Methods {

    public static void main(String[] args) {
        //marks, grade
        // marks - 900 to 1000 = A grade
        // marks - 751 to 899 = B grade
        // marks - 600 to 750 = c grade
        // marks - 350 to 599 = d grade
        // marks - less than 350 = f

        grades(999);
        grades(759);
        grades(750);
        grades(350);
        grades(200);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Student1",position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Student2",position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Student3",position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Student4",position);

    }

    public static String grades(int studentMarks) {

        String studentGrade;

        if (studentMarks >= 900) {
            System.out.println("Student Grade is " + (studentGrade = "A"));
        }
        else if (studentMarks >=751){
            System.out.println("Student Grade is " + (studentGrade = "B"));
        }
        else if (studentMarks >=600){
            System.out.println("Student Grade is " + (studentGrade = "C"));
        }
        else if (studentMarks >=350){
            System.out.println("Student Grade is " + (studentGrade = "D"));
        }
        else {
            System.out.println("Better luck next time, because you have " + (studentGrade = "FAILED"));
        }

        return studentGrade;

    }

    public static void displayHighScorePosition(String playersName,int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if(playerScore >= 1000   ){
//            return 1;
//        }
//        else if(playerScore >= 500){
//            return 2;
//        }
//        else if (playerScore >= 100){
//            return 3;
//        }
//        else {
//            return 4;
//        }

        int position = 4;  // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;

    }
}
