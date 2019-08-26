package strings;

public class stringPrograms {

        /*
           1.Write a java program to compare two strings, ignoring case differences.
           2.Write a Java program to concatenate a given string to the end of another string.
           3.Write a java program to get the length of a given string
           4.Write a Java program to get a substring of a given string between two specified positions
           5.Write a Java program to convert all the characters in a string to uppercase.
           6.Write a Java program to convert all the characters in a string to lowercase.
           7.Write a Java program to reverse a string.
           8.Write a Java program to count number of time a character repeated in a string.
           9.Write a Java program to convert integer to string.
           10.Write a Java program to convert string to integer.
           11.Write a Java program to Swap the 2 strings.
           12.Write a program to check a string is palindrome or not
         */

    public static void main(String[] args) {

        //7.Write a Java program to reverse a string.
        String s = "Selenium";
        /*
        Logic
        muineles

         */
        int len = s.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println(rev);
        System.out.println("***********************************************");

        //find out an string is present in the string array
        String a[] = {"Java", "Selenium", "REST", "GIT"};
        String element = "REST";
        boolean flag=false;

        for (String i:a){
            if (i.equals(element)) {
                System.out.println("Element found is " + element);
                flag = true;
                break;
            }
        }
        if (flag!=true){
            System.out.println("Element not found");
        }

        System.out.println("**************************************************************************");

        // 1.Write a java program to compare two strings, ignoring case differences.

        String s1 = "Test The Strings";
        String s2 = "test the strings";

        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));


        System.out.println("**************************************************************************");
        //2.Write a Java program to concatenate a given string to the end of another string.

        String s3 = "in Java";
        System.out.println(s1.concat(" " + s3));

        System.out.println("**************************************************************************");
        // 3.Write a java program to get the length of a given string
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s3.length());

        System.out.println("**************************************************************************");
        //4.Write a Java program to get a substring of a given string between two specified positions
        System.out.println(s1.substring(0,5));

        System.out.println("**************************************************************************");
        //5.Write a Java program to convert all the characters in a string to uppercase.
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toUpperCase());

        System.out.println("**************************************************************************");
        //6.Write a Java program to convert all the characters in a string to lowercase.
        String up = "LEARN JAVA";
        System.out.println(up.toLowerCase());

        System.out.println("**************************************************************************");
        // 8.Write a Java program to count number of times a character repeated in a string.


        System.out.println("**************************************************************************");
        // 9.Write a Java program to convert integer to string.

        /*int i = 768768878;
        String convert = String.valueOf(i);
        System.out.println(convert);*/

        System.out.println("**************************************************************************");


    }

}
