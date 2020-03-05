package strings;

public class StringDemo {

    /*
    In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string.
    For example:
    char[] ch={'j','a','v','a','t','p','o','i','n','t'};
    String s=new String(ch);
    is Same as: String s="javatpoint";

    Java String class provides a lot of Calculation_methods to perform operations on string such as compare(), concat(), equals(), split(),
    length(), replace(), compareTo(), intern(), substring() etc.
     */
    public static void main(String[] args) {

        //Methods in Strings are as follows:

        // 1.length(): It returns count of total number of characters present in the string
        String s = "Welcome";
        System.out.println("The length of the word Welcome is " +s.length());

        System.out.println("*************************************************************");

        //2.concat(): Combines a specific string at the end of another string and ultimately returns a combined string. It is like appending another string
        String a = "Welcome";
        String b = "To Java";
        System.out.println("The Concatenation of a and b is " + a.concat(b));

        System.out.println("*************************************************************");

        //3.trim(): The java String trim() method removes the leading and trailing spaces.
        String c = "   Welcome   ";
        System.out.println("The word c after trim is " + c.trim());

        System.out.println("*************************************************************");
        // 4.charAt(): Returns a char value at the given index number. The index number starts from 0.
        System.out.println("The character at the index number 3 of Welcome is " +s.charAt(3));

        System.out.println("*************************************************************");
        //5.Contains(): Searches the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false
        // boolean function - it returns true/false
        System.out.println("The Welcome word contains 'Welc' is " + s.contains("Welc"));
        System.out.println("The Welcome word contains 'Wedc' is " + s.contains("Wedc"));

        System.out.println("*************************************************************");
        //6. equals(): Compares the two given strings based on the content the String. If any character is not matched, it returns false. If all characters are matched, it returns true
        //boolean function - it returns true/false
        System.out.println("The String s is equals to 'Welcome' is " +s.equals("Welcome"));
        System.out.println("The String s is equals to 'welcome' is " +s.equals("welcome"));

        System.out.println("*************************************************************");
        //7.equalsIgnoreCase(): Compares two string on the basis of content but it does not check the case like equals() method. In this method, if the characters match, it returns true else false.
        //boolean function - it returns true/false
        System.out.println("The String s is equals to 'welcome' is " +s.equalsIgnoreCase("welcome"));

        System.out.println("*************************************************************");
        //8.replace(): Returns a string, replacing the old characters or CharSequence to new characters. There are 2 ways to replace Calculation_methods.
        System.out.println("Replace The String Welcome with " + s.replace('l','!'));
        System.out.println("Replace the String Welcome with " + s.replace("Welcome","Selenium"));

        System.out.println("*************************************************************");
        //9. Substring(): Returns substring of a string based on starting index and ending index
        // Starting index starts with 0; Ending index starts with 1
        System.out.println("The Substring of Welcome from index 0-3 is " + s.substring(0,3));
        System.out.println("The Substring of Welcome from index  3 is " + s.substring(3));
        System.out.println("The Substring of Welcome from index 3-7 is " + s.substring(3,7));

        System.out.println("*************************************************************");
        //10. toLoweCase(): returns the string in lowercase letter
        String lc = "TEST THE SELENIUM";
        System.out.println("The String 'TEST THE SELENIUM' to lowercase " +lc.toLowerCase());

        System.out.println("*************************************************************");
        //11. toUpperCase(): returns the string in UpperCase letter
        String uc = "test the selenium";
        System.out.println("The String 'test the selenium' to uppercase " + uc.toUpperCase());


    }
}
