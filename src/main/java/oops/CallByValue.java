package oops;

public class CallByValue {

    int x;

    void add(int a){
         x = a + 5;
    }
    public static void main(String[] args) {

        CallByValue cv = new CallByValue();
        cv.add(10);
        System.out.println(cv.x);

    }
}
