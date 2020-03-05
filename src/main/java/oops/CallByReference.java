package oops;

public class CallByReference {

    int x;

    void add(int a){
        x = a + 5;
    }
    public static void main(String[] args) {

        CallByReference cv = new CallByReference();
        cv.x = 10;
        cv.add(cv.x);
        System.out.println(cv.x);

    }
}
