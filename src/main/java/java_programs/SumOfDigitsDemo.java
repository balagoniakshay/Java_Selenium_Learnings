package java_programs;

public class SumOfDigitsDemo {

    public static void main(String[] args) {

        int sum = 0;

        int num = 1234;

        while (num>0)
        {
            sum = sum + num%10;
            num = num/10;
        }

        System.out.println(sum);
    }

}
