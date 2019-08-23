package javaBasics;

import java.util.Scanner;

public class StringExamples {

    public static void main(String[] args) {

        /*reverse the string*/
        String str = "Akshay";
        String t = "";
        for(int i=str.length()-1; i>=0; i--){
            t = t + str.charAt(i);
        }
        System.out.println(t);

      /* String str = "Akshay";
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(reverse);*/

        /*System.out.println("Enter string to reverse:");

        Scanner read = new Scanner(System.in);
        String s = read.nextLine();

        StringBuilder sb = new StringBuilder(s);

        System.out.println("Reversed string is:");
        System.out.println(sb.reverse().toString());*/

        /*Sum of numbers in array*/

        int numbers[] = {10,20,30,40};
        int sum = 0;
        int index = 0;

        for (int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
            if (numbers[i]==30){
                System.out.println(i);
                break;
            }
        }

        System.out.println(sum);
    }
}
