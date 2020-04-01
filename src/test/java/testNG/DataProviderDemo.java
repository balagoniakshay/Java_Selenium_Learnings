package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

   @Test(dataProvider = "users")
    void loginTest(String username, String pwd)
    {
        driver.get("http://newtours.demoaut.com/");
        driver.findElement(By.name("userName")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("login")).click();
        Assert.assertEquals(driver.getTitle(),"Find a Flight: Mercury Tours:");

    }

    @DataProvider(name="users")
    Object[][] loginData()
    {
        String data[][] = {{"mercury", "mercury"},{"mer","mer"},{"mercury1","mercury1"}};
        return data;
    }

    @AfterClass
    void closeBrowser()
    {
        driver.close();
    }
}
