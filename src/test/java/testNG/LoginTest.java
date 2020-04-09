package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.font.TrueTypeFont;

public class LoginTest {

    @Test
    void setup()
    {
        Assert.assertTrue(true);
    }

    @Test
    void loginByEmail()
    {
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"setup"})
    void loginByFacebook()
    {
        Assert.assertTrue(true);
    }
}
