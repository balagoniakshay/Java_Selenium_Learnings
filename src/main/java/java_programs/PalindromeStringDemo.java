package java_programs;

public class PalindromeStringDemo {

    public static void main(String[] args) {

        String str = "MADAM";

        String org_str = str;

        String rev = "";

        int len = str.length();

        for (int i=len-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }

        if (org_str.equals(rev))
        {
            System.out.println("Org_String is Palindrome " + org_str);
        }
        else
        {
            System.out.println("Org_String is not a palindrome");
        }
    }
}
