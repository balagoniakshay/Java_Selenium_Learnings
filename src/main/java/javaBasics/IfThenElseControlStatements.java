package javaBasics;

public class IfThenElseControlStatements {

    public static void main(String[] args) {

        int score = 100;
        int salary = 1000;
        int bonus = 200;
        boolean performanceOutstanding = true;
        boolean gameOver = true;
        int levelCompleted = 8;

        if (score < 5000 && score > 1000) {
            System.out.println("The scores are less than 5000 and greater than 1000");
        } else if (score <= 5000) {
            System.out.println("The Scores are less than or equals to 5000");
        } else {
            System.out.println("Scores are wrong");
        }

        if (performanceOutstanding) {
            int finalSalary = salary + bonus;
            System.out.println("Salary is " + finalSalary);
        } else {
            System.out.println("Salary is " + salary);
        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score is " + finalScore);
        }

        //Challenge

        score = 10000;
        bonus = 200;
        gameOver = true;
        levelCompleted = 8;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score is " + finalScore);
        }
    }

}
