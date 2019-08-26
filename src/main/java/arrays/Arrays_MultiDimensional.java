package arrays;

public class Arrays_MultiDimensional {

  /*
  2. Two dimensional array/Multi dimensional/ Double dimensional array
        a. Declare an array
        b. Insert values into an array
        c. Find size of an array
        d. read values from an array
   */

    public static void main(String[] args) {

        // a. Declare an array
        int a[][] = new int[3][2]; //static array

        //b. Insert values into an array
        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        int b[][] = {{100,200},{300,400},{500,600},{700,800}}; //dynamic array

        // c. Find size of an array
        System.out.println("Number of rows " + a.length); // gives rows
        System.out.println("Number of columns " + a[0].length); //gives columns


        // d. read values from an array
        System.out.println("****************************************");
        for (int i=0;i<b.length;i++) // i represents row index        ;  i = 0
        {
            for (int j=0;j<b[i].length;j++) // j represents column index  ; j=0, j=1, j=2, j=3;
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        //Enhanced for loop or for each loop
        System.out.println("****************************************");
        for (int x[]:b)
        {
            for (int i:x){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        System.out.println("****************************************");


    }
}
