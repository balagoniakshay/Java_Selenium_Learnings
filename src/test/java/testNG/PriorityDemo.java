package testNG;

import org.testng.annotations.Test;

public class PriorityDemo {

    @Test(priority = 2)
    public void login()
    {
        System.out.println("I have logged in");
    }

    @Test(priority = 3)
    public void logout()
    {
        System.out.println(("I am logged out"));
    }

    @Test(priority = 1)
    public void openUrl()
    {
        System.out.println("I have opened the url");
    }

}
