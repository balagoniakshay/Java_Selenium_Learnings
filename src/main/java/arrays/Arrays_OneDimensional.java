package arrays;

public class Arrays_OneDimensional {

    /*
    Array is collection of variable of same data type

    Two types of arrays:
    1. Single dimensional array
    2. Two dimensional array/Multi dimensional/ Double dimensional array

    1. Single dimensional array
        a. Declare an array
        b. Insert values into array
        c. Find size of an array
        d. Read values from an array

       a. Declare an array:
                int a[] = new int[5];
                //5 is size of an array;
                we can save 5 values;
                Every value has index;
                Index starts with 0;

     */

    public static void main(String[] args) {
        //a. Declare an array
        int a[] = new int[5]; // this is static array; if you know the size of an array go for the static array;

        //b. Insert values into array
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        int b[] = {100, 200, 300, 400, 500, 600, 700}; // this is dynamic array; if you do not know the size of an array go for the dynamic array;

        // c. Find size of an array using length function

        System.out.println(a.length);
        System.out.println(b.length);

        // d. Read values from an array
        System.out.println("****************************************");
        System.out.println(a[2]);
        System.out.println(b[4]);

        //Extract multiple values from array
        //0,1,2,3,4
        System.out.println("****************************************");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }
        System.out.println("****************************************");
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.println(b[i]);
        }

        //extract using for each loop/enhanced for loop
        System.out.println("****************************************");
        for (int i : a) {
            System.out.println(i);
        }

        System.out.println("****************************************");
        for (int i : b) {
            System.out.println(i);
        }

        System.out.println("****************************************");
        // write a program if an array as an specific element

        int c[] = {10, 20, 30, 40, 50};

        int num = 40;
        boolean flag = false;

        for (int r : c) //here c will have all the values - 10, 20, 30, 40, 50 and they are stored in r variable
        {
            if (r == num) {
                System.out.println("element found " + r);
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("element not found");
        }

        System.out.println("****************************************");
        // Calculate sum of elements in array
        int d[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int value : d) {
            sum = value + sum;
        }

        System.out.println("Sum of elements in array " + sum);

        System.out.println("****************************************");
        // Even numbers in array
        //Odd numbers in array

        int e[] = {21, 32, 434, 65, 34, 45, 23, 76};

        for (int number : e) {
            if (number % 2 == 0) //Print only even numbers
            {
                System.out.println("The Even numbers in array : " + number);
            }
        }
        System.out.println("****************************************");
        for (int number : e) {
            if (number % 2 != 0) //Print only odd numbers
            {
                System.out.println("The Odd numbers in array : " + number);
            }
        }

        System.out.println("****************************************");
        //Find positive and negative numbers in an array

        int f[] = {2, -32, 23, 43, -23, 45, 65, -12, 35};

        for (int pos : f) {
            if (pos > 0) {
                System.out.println("Positive numbers in array are " + pos);
            }
        }
        System.out.println("****************************************");
        for (int neg : f) {
            if (neg < 0) {
                System.out.println("Negative numbers in array are " + neg);
            }
        }
    }
}
