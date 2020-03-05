package java_programs;

public class ReverseString {

    public static void main(String[] args) {

        String str = "ABCD";

        String rev = "";

        //using char at
     /*   int len = str.length();

        for (int i=len-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);*/

        //using char array

      /*  char a[] = str.toCharArray();

        int len = a.length;

        for (int i=len-1;i>=0;i--)
        {
            rev = rev + a[i];
        }

        System.out.println(rev);*/

      StringBuffer sb = new StringBuffer(str);

      sb.reverse();

      System.out.println(sb);

    }
}
